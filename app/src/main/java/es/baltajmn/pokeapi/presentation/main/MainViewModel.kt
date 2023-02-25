package es.baltajmn.pokeapi.presentation.main

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import es.baltajmn.pokeapi.lib.pokekotlin.client.PokeApiClient
import es.baltajmn.pokeapi.lib.pokekotlin.model.NamedApiResource
import es.baltajmn.pokeapi.lib.pokekotlin.model.NamedApiResourceList
import es.baltajmn.pokeapi.lib.pokekotlin.model.Pokemon
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.receiveAsFlow
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val pokeAPi: PokeApiClient
) : ViewModel() {

    private val _event = Channel<Event>()
    val event: Flow<Event> = _event.receiveAsFlow()

    private val _state = MutableStateFlow(MainActivityState(showSkeleton = false))
    val state: StateFlow<MainActivityState> = _state.asStateFlow()

    fun initContent() {
        pokeAPi.getPokemonList(0, 30).also {
            _state.value = _state.value.copy(
                pokemonsResource = it
            )
            getPokemons(it.results)
        }
    }

    private fun getPokemons(results: List<NamedApiResource>) {
        val pokemonsList: MutableList<Pokemon> = mutableListOf()
        results.forEach { apiResource ->
            pokeAPi.getPokemon(apiResource.id).also {
                pokemonsList.add(it)
            }
        }
        _state.value = _state.value.copy(
            pokemons = pokemonsList
        )
    }

    data class MainActivityState(
        val showSkeleton: Boolean = false,
        val pokemons: MutableList<Pokemon> = mutableListOf(),
        val pokemonsResource: NamedApiResourceList? = null
    )

    sealed class Event {
        object OnSuccess : Event()
    }
}