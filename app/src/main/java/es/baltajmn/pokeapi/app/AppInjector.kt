package es.baltajmn.pokeapi.app

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import es.baltajmn.pokeapi.lib.pokekotlin.client.PokeApiClient
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    @Provides
    fun providePokeApiClient(): PokeApiClient {
        return PokeApiClient()
    }
}
