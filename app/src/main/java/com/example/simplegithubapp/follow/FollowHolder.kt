package com.example.simplegithubapp.follow

import androidx.recyclerview.widget.RecyclerView
import com.example.simplegithubapp.databinding.RvItemFollowerBinding

class FollowHolder(val binding: RvItemFollowerBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(data: RvItemFollow) {
        binding.rvFollow = data
    }
}