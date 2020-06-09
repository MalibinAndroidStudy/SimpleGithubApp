package com.example.simplegithubapp.main

import android.content.Context
import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.simplegithubapp.R

class OrganizationHolder (view: View, var context: Context):RecyclerView.ViewHolder(view){
    val imgOrganization:ImageView=view.findViewById(R.id.img_rv_item_organizations)

    fun bind(data: ImgOrganization){
        imgOrganization.setImageResource(data.img)
    }
}