package com.example.cadi_kotlin_study.feature.repository_list

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.cadi_kotlin_study.R
import com.example.cadi_kotlin_study.data.repository.RepoItem
import com.example.cadi_kotlin_study.databinding.RvItemRepoBinding

class RepoViewHolder (val binding: RvItemRepoBinding) : RecyclerView.ViewHolder(binding.root) {

    fun onbind(repo: RepoItem){
        binding.rvRepo = repo
    }
}