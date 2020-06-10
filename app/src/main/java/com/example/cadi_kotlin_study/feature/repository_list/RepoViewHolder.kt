package com.example.cadi_kotlin_study.feature.repository_list

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.cadi_kotlin_study.R
import com.example.cadi_kotlin_study.data.repository.RepoItem

class GitRepoViewHolder (view: View) : RecyclerView.ViewHolder(view) {

    val txtTitle : TextView = view.findViewById(R.id.title)
    val txtDescription : TextView = view.findViewById(R.id.description)
    val imgColor : ImageView = view.findViewById(R.id.language_color)
    val txtLanguage : TextView = view.findViewById(R.id.language)

    fun bind(data: RepoItem){
        txtTitle.text = data.title
        txtDescription.text = data.desc
        txtLanguage.text = data.language
    }
}