package com.example.simplegithubapp.follow


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.simplegithubapp.databinding.RvItemFollowerBinding


class FollowAdapter() : RecyclerView.Adapter<FollowHolder>() {
    lateinit var data: ArrayList<RvItemFollow>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FollowHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = RvItemFollowerBinding.inflate(layoutInflater)
        return FollowHolder(binding)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: FollowHolder, position: Int) {
        holder.bind(data[position])
    }

}