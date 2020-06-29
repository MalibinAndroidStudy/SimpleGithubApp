package com.example.simplegithubapp.repository

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.simplegithubapp.R
import com.example.simplegithubapp.databinding.RvItemRepositoryBinding
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.coroutines.coroutineContext

class RepositoryListAdapter :ListAdapter<RvItemRepository,RepositoryListAdapter.RepositoryHolder>(DiffToll()){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RepositoryListAdapter.RepositoryHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = RvItemRepositoryBinding.inflate(layoutInflater)
        return RepositoryHolder(binding)
    }

    override fun onBindViewHolder(holder: RepositoryListAdapter.RepositoryHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }
    inner class RepositoryHolder(val binding : RvItemRepositoryBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(data:RvItemRepository){
            binding.rvRepository=data


        }
    }

    private class DiffToll:DiffUtil.ItemCallback<RvItemRepository>(){
        override fun areItemsTheSame(
            oldItem: RvItemRepository,
            newItem: RvItemRepository
        ): Boolean {
            return oldItem.name==newItem.name
        }

        override fun areContentsTheSame(
            oldItem: RvItemRepository,
            newItem: RvItemRepository
        ): Boolean {
            return oldItem==newItem
        }

    }


}