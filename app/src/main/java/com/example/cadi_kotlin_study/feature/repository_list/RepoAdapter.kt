package com.example.cadi_kotlin_study.feature.repository_list

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cadi_kotlin_study.R
import com.example.cadi_kotlin_study.data.repository.RepoItem
import com.example.cadi_kotlin_study.databinding.RvItemRepoBinding

class RepoAdapter(private val context: Context?) : RecyclerView.Adapter<RepoViewHolder>(){

    var data = listOf<RepoItem>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RepoViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = RvItemRepoBinding.inflate(layoutInflater)
        return RepoViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: RepoViewHolder, position: Int) {
        holder.bind(data[position])
    }
}