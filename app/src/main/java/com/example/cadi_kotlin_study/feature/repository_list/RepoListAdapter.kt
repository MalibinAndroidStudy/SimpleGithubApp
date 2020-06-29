package com.example.cadi_kotlin_study.feature.repository_list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.example.cadi_kotlin_study.data.follower.FollowerItem
import com.example.cadi_kotlin_study.data.repository.RepoItem
import com.example.cadi_kotlin_study.databinding.RvItemRepoBinding

class RepoListAdapter : ListAdapter<RepoItem, RepoViewHolder>(DiffTool()){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RepoViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = RvItemRepoBinding.inflate(layoutInflater)
        return RepoViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RepoViewHolder, position: Int) {
        val item = getItem(position)
        holder.onbind(item)
    }

    private class DiffTool: DiffUtil.ItemCallback<RepoItem>(){
        // 두 객체가 같은 항목인지 여부 결정.
        override fun areItemsTheSame(oldItem: RepoItem, newItem: RepoItem): Boolean {
            return oldItem == newItem
        }

        // 두 항목의 데이터가 같은지 여부 결정.
        override fun areContentsTheSame(oldItem: RepoItem, newItem: RepoItem): Boolean {
            return oldItem == newItem
        }
    }
}