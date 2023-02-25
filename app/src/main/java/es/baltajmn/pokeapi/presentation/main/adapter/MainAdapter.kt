package es.baltajmn.pokeapi.presentation.main.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import es.baltajmn.pokeapi.R
import es.baltajmn.pokeapi.databinding.ItemMainBinding
import es.baltajmn.pokeapi.lib.pokekotlin.model.Pokemon

class MainAdapter(private val data: List<Pokemon>) : RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val binding = ItemMainBinding.bind(view)
        fun bind(pokemon: Pokemon) = with(binding) {
            name.text = pokemon.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_main, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val pokemon = data[position]
        holder.bind(pokemon)
    }

    override fun getItemCount(): Int {
        return data.size
    }
}