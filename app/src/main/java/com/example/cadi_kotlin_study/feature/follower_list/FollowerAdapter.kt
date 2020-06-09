package com.example.cadi_kotlin_study.feature.follower_list

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cadi_kotlin_study.R
import com.example.cadi_kotlin_study.data.follower.FollowerItem

class FollowerAdapter(private val context: Context) : RecyclerView.Adapter<FollowerViewHolder>() {
    var data: List<FollowerItem> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FollowerViewHolder {
        // list item follower.xml을 객체화 한다(inflate 한다).
        val view: View = LayoutInflater
            .from(context)
            .inflate(R.layout.rv_item_follower, parent, false)
        return FollowerViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: FollowerViewHolder, position: Int) {
        holder.onBind(data[position])
    }
}