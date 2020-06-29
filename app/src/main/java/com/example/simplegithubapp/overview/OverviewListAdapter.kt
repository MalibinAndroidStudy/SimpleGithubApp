package com.example.simplegithubapp.overview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.simplegithubapp.databinding.RvItemOverviewBinding


class OverviewListAdapter : ListAdapter<RvItemOverview, OverviewListAdapter.OverviewHolder>(DiffToll()){

    inner class OverviewHolder(val binding:RvItemOverviewBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(data:RvItemOverview){
            binding.rvOverview=data
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OverviewHolder {
        val layoutInflater=LayoutInflater.from(parent.context)
        val binding =RvItemOverviewBinding.inflate(layoutInflater)
        return OverviewHolder(binding)
    }

    override fun onBindViewHolder(holder: OverviewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }


    private class DiffToll: DiffUtil.ItemCallback<RvItemOverview>(){
        override fun areItemsTheSame(oldItem: RvItemOverview, newItem: RvItemOverview): Boolean {
            return oldItem==newItem
        }
        override fun areContentsTheSame(oldItem: RvItemOverview, newItem: RvItemOverview): Boolean {
            return oldItem==newItem
        }
    }


}