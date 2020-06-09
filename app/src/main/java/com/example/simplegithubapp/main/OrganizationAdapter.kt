package com.example.simplegithubapp.main

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.simplegithubapp.R

class OrganizationAdapter(private val context:Context):RecyclerView.Adapter<OrganizationHolder>(){

    //data binding로 이미지 받아오기
    var data = listOf<ImgOrganization>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrganizationHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.rv_item_organizations,parent,false)
        return OrganizationHolder(view, context)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: OrganizationHolder, position: Int) {
        holder.bind(data[position])
    }
}


data class ImgOrganization(
    val img:Int
)
