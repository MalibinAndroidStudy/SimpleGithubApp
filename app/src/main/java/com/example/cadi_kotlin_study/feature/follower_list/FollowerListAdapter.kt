package com.example.cadi_kotlin_study.feature.follower_list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.example.cadi_kotlin_study.data.follower.FollowerItem
import com.example.cadi_kotlin_study.databinding.RvItemFollowerBinding

class FollowerListAdapter : ListAdapter<FollowerItem, FollowerViewHolder>(DiffTool()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FollowerViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = RvItemFollowerBinding.inflate(layoutInflater)
        return FollowerViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FollowerViewHolder, position: Int) {
        val item = getItem(position)
        holder.onBind(item)
    }

    private class DiffTool:DiffUtil.ItemCallback<FollowerItem>(){
        // 두 객체가 같은 항목인지 여부 결정.
        override fun areItemsTheSame(oldItem: FollowerItem, newItem: FollowerItem): Boolean {
            return oldItem == newItem
        }

        // 두 항목의 데이터가 같은지 여부 결정.
        override fun areContentsTheSame(oldItem: FollowerItem, newItem: FollowerItem): Boolean {
            return oldItem == newItem
        }
    }
}