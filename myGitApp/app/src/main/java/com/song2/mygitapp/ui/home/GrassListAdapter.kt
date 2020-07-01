package com.song2.mygitapp.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.song2.mygitapp.databinding.ItemGrassBinding
import com.song2.mygitapp.databinding.ItemStartsBinding

class GrassListAdapter : ListAdapter<Grass, GrassListAdapter.ViewHolder>(
    DiffTool()
) {

    private class DiffTool : DiffUtil.ItemCallback<Grass>(){
        override fun areItemsTheSame(oldItem: Grass, newItem: Grass): Boolean {
            return oldItem.day == newItem.day
        }

        override fun areContentsTheSame(oldItem: Grass, newItem: Grass): Boolean {
            return oldItem == newItem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemGrassBinding.inflate(layoutInflater)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = getItem(position)

        holder.bind(item)
    }

    inner class ViewHolder(private val binding: ItemGrassBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(grass : Grass){
            binding.grass = grass
        }
    }
}

data class Grass(
    val day: String,
    val cnt: Int
)