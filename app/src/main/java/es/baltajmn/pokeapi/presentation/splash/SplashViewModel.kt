package es.baltajmn.pokeapi.presentation.splash

import androidx.lifecycle.ViewModel
import es.baltajmn.pokeapi.lib.pokekotlin.client.PokeApiClient
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.receiveAsFlow
import javax.inject.Inject

class SplashViewModel : ViewModel() {

    private val _event = Channel<Event>()
    val event: Flow<Event> = _event.receiveAsFlow()

    private val _state = MutableStateFlow(SplashActivityState(showSkeleton = false))
    val state : StateFlow<SplashActivityState> = _state.asStateFlow()


    data class SplashActivityState(
        val showSkeleton: Boolean = false
    )

    sealed class Event {
        object OnSuccess : Event()
    }
}