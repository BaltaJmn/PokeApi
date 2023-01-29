package es.baltajmn.pokeapi.app.network

import io.reactivex.Single
import retrofit2.http.GET

interface ApiService {
    @GET("")
    fun default() : Single<List<Any>>
}