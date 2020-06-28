package com.example.githubproject.network

import com.example.githubproject.data.GithubMyWork
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface RequestInterface{
    @GET("/users/{username}/starred")
    fun getStarResponse(
        @Path("username") username: String?
    ) : Call<List<GithubMyWork>>
}