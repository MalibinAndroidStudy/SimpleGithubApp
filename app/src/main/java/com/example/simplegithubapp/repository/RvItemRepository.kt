package com.example.simplegithubapp.repository

data class RvItemRepository(
    val name:String,
    val desc: String,
    val forkNum: Int,
    val languageColor: Int,
    val language: String,
    val lastUpdate: Int
)