package com.example.simplegithubapp.main

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.annotation.DrawableRes
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.simplegithubapp.R


class OrganizationListAdapter : ListAdapter<ImgOrganization, OrganizationListAdapter.OrganizationHolder>(DiffToll()) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrganizationHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
            .inflate(R.layout.rv_item_organizations, parent, false)
        return OrganizationHolder(layoutInflater, parent.context)
    }

    override fun onBindViewHolder(holder: OrganizationHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }

    inner class OrganizationHolder(view: View, var context: Context) :
        RecyclerView.ViewHolder(view) {
        val imgOrganization: ImageView = view.findViewById(R.id.img_rv_item_organizations)

        fun bind(data: ImgOrganization) {
            imgOrganization.setImageResource(data.img)
        }
    }

    private class DiffToll : DiffUtil.ItemCallback<ImgOrganization>() {
        override fun areItemsTheSame(oldItem: ImgOrganization, newItem: ImgOrganization): Boolean {
            return oldItem.img == newItem.img
        }

        override fun areContentsTheSame(
            oldItem: ImgOrganization,
            newItem: ImgOrganization
        ): Boolean {
            return oldItem == newItem
        }

    }
}

data class ImgOrganization(
    @DrawableRes
    val img: Int
)
