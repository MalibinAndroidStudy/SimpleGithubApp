package com.example.simplegithubapp.follow

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.simplegithubapp.databinding.RvItemFollowerBinding

class FollowListAdpater :ListAdapter<RvItemFollow,FollowListAdpater.FollowListHolder>(DiffToll()){
    inner class FollowListHolder(val binding: RvItemFollowerBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(data: RvItemFollow){
            binding.rvFollow=data
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FollowListHolder {
        val layoutInflater=LayoutInflater.from(parent.context)
        val binding=RvItemFollowerBinding.inflate(layoutInflater)
        return FollowListHolder(binding)
    }

    override fun onBindViewHolder(holder: FollowListHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }
    private class DiffToll:DiffUtil.ItemCallback<RvItemFollow>(){
        override fun areItemsTheSame(oldItem: RvItemFollow, newItem: RvItemFollow): Boolean {
            return oldItem.followName==newItem.followName
        }

        override fun areContentsTheSame(oldItem: RvItemFollow, newItem: RvItemFollow): Boolean {
            return oldItem.equals(newItem)
        }

    }
}