package com.song2.mygitapp.data


import com.google.gson.annotations.SerializedName

data class GetMyFeedListResponse(
    @SerializedName("actor")
    val githubUser: GithubUser,
    @SerializedName("created_at")
    val createdAt: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("org")
    val organization: Organization,
    @SerializedName("payload")
    val payload: Payload,
    @SerializedName("public")
    val `public`: Boolean,
    @SerializedName("repo")
    val repository: Repository,
    @SerializedName("type")
    val type: String
)