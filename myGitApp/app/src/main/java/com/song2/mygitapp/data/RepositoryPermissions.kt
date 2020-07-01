package com.song2.mygitapp.data

import com.google.gson.annotations.SerializedName

data class RepositoryPermissions(
    @SerializedName("admin")
    val admin: Boolean,
    @SerializedName("pull")
    val pull: Boolean,
    @SerializedName("push")
    val push: Boolean
)