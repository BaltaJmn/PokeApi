package es.baltajmn.pokeapi.app

import es.baltajmn.pokeapi.app.network.RxSingleSchedulers
import es.baltajmn.pokeapi.app.network.createBasicAuthService
import es.baltajmn.pokeapi.presentation.main.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val networkModule = module {
    single { createBasicAuthService() }
    single { RxSingleSchedulers.DEFAULT }
}

val viewModelModule = module {
    viewModel {
        MainViewModel()
    }
}