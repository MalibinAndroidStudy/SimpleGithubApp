package com.song2.mygitapp.data


import com.google.gson.annotations.SerializedName

data class Repository(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("url")
    val url: String
)