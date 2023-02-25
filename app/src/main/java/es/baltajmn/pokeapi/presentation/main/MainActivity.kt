package es.baltajmn.pokeapi.presentation.main

import android.os.Bundle
import android.os.StrictMode
import android.os.StrictMode.ThreadPolicy
import android.widget.LinearLayout
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dagger.hilt.android.AndroidEntryPoint
import es.baltajmn.pokeapi.databinding.ActivityMainBinding
import es.baltajmn.pokeapi.lib.extensions.collectEvent
import es.baltajmn.pokeapi.lib.extensions.collectState
import es.baltajmn.pokeapi.lib.pokekotlin.model.Pokemon
import es.baltajmn.pokeapi.presentation.main.adapter.MainAdapter

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        StrictMode.setThreadPolicy(ThreadPolicy.Builder().permitAll().build())

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        initObservables()
        viewModel.initContent()
    }

    private fun initObservables() {
        collectState(viewModel.state) { renderState(it) }
        collectEvent(viewModel.event) { launchEvent(it) }
    }

    private fun renderState(state: MainViewModel.MainActivityState) {
        setContentToRecycler(state.pokemons)
    }

    private fun launchEvent(event: MainViewModel.Event) {

    }

    private fun setContentToRecycler(pokemons: MutableList<Pokemon>){
        binding.recycler.adapter = MainAdapter(pokemons)
        binding.recycler.layoutManager = LinearLayoutManager(this)
    }
}