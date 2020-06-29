package com.example.githubproject.ui.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.githubproject.data.GithubMyWork
import com.example.githubproject.databinding.RvItemListMyWorkBinding

class GithubMyWorkAdapter : ListAdapter<GithubMyWork, GithubMyWorkAdapter.ViewHolder>(DiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = RvItemListMyWorkBinding.inflate(layoutInflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        val repository = getItem(position)
//        holder.bind(repository)
        val item = getItem(position)
        holder.bind(item)
    }


    inner class ViewHolder(private val binding: RvItemListMyWorkBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(githubMyWork: GithubMyWork){
            binding.bind  = githubMyWork
        }
    }

    private class DiffCallback : DiffUtil.ItemCallback<GithubMyWork>() {
        override fun areItemsTheSame(oldItem: GithubMyWork, newItem: GithubMyWork): Boolean {
            return oldItem.name == newItem.name
        }

        override fun areContentsTheSame(oldItem: GithubMyWork, newItem: GithubMyWork): Boolean {
            return oldItem == newItem
        }
    }

}

