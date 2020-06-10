package com.example.cadi_kotlin_study.feature.follower_list

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cadi_kotlin_study.R
import com.example.cadi_kotlin_study.data.follower.FollowerItem
import com.example.cadi_kotlin_study.databinding.RvItemFollowerBinding

class FollowerAdapter(private val context: Context?) : RecyclerView.Adapter<FollowerViewHolder>() {
    var data: List<FollowerItem> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FollowerViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = RvItemFollowerBinding.inflate(layoutInflater)
        return FollowerViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: FollowerViewHolder, position: Int) {
        holder.onBind(data[position])
    }
}