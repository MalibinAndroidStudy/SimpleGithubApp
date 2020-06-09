package com.example.cadi_kotlin_study.feature.repository_list

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cadi_kotlin_study.R
import com.example.cadi_kotlin_study.data.repository.RepoItem

class GitRepoAdapter (private val context: Context) : RecyclerView.Adapter<GitRepoViewHolder>(){

    var data = listOf<RepoItem>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GitRepoViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.rv_item_repo,parent,false)

        return GitRepoViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: GitRepoViewHolder, position: Int) {
        holder.bind(data[position])
    }
}