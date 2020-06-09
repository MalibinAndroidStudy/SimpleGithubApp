package com.example.simplegithubapp.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.example.simplegithubapp.R


class OrganizationListAdapter: ListAdapter<ImgOrganization, OrganizationHolder>(DiffToll()){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrganizationHolder {
        val layoutInflater=LayoutInflater.from(parent.context).inflate(R.layout.rv_item_organizations,parent,false)
        return OrganizationHolder(
            layoutInflater,
            parent.context
        )
    }

    override fun onBindViewHolder(holder: OrganizationHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }

    private class DiffToll:DiffUtil.ItemCallback<ImgOrganization>(){
        override fun areItemsTheSame(oldItem: ImgOrganization, newItem: ImgOrganization): Boolean {
            return oldItem.img==newItem.img
        }

        override fun areContentsTheSame(
            oldItem: ImgOrganization,
            newItem: ImgOrganization
        ): Boolean {
            return oldItem==newItem
        }

    }
}
