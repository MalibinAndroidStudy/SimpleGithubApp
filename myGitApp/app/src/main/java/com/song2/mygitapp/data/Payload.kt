package com.song2.mygitapp.data


import com.google.gson.annotations.SerializedName

data class Payload(
    @SerializedName("action")
    val action: String?,
    @SerializedName("forkee")
    val forkee: Forkee?,
    @SerializedName("ref")
    val ref: String?,
    @SerializedName("ref_type")
    val ref_type: String?,
    @SerializedName("master_branch")
    val master_branch: String?,
    @SerializedName("description")
    val description: String?,
    @SerializedName("pusher_type")
    val pusher_type: String?
)