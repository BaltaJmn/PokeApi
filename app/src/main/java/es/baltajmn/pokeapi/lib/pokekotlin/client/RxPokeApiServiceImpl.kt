package es.baltajmn.pokeapi.lib.pokekotlin.client

import com.google.gson.FieldNamingPolicy
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import es.baltajmn.pokeapi.lib.pokekotlin.model.ApiResource
import es.baltajmn.pokeapi.lib.pokekotlin.model.NamedApiResource
import es.baltajmn.pokeapi.lib.pokekotlin.util.ApiResourceAdapter
import es.baltajmn.pokeapi.lib.pokekotlin.util.NamedApiResourceAdapter
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

internal class RxPokeApiServiceImpl(
    private val config: ClientConfig
) : RxPokeApiService by Retrofit.Builder()
    .baseUrl(config.rootUrl)
    .addConverterFactory(
        GsonConverterFactory.create(
            GsonBuilder().apply {
                setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                registerTypeAdapter(
                    TypeToken.get(ApiResource::class.java).type,
                    ApiResourceAdapter()
                )
                registerTypeAdapter(
                    TypeToken.get(NamedApiResource::class.java).type,
                    NamedApiResourceAdapter()
                )
            }.create()
        )
    )
    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
    .client(OkHttpClient.Builder().(config.okHttpConfig)().build())
    .build()
    .create(RxPokeApiService::class.java)
