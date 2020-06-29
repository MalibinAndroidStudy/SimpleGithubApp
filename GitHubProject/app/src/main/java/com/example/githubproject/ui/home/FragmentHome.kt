package com.example.githubproject.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.githubproject.data.GithubMyWork
import com.example.githubproject.databinding.FragmentHomeBinding
import com.example.githubproject.network.RequestURL
import com.example.githubproject.ui.home.adapter.GithubMyWorkAdapter
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class FragmentHome : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentHomeBinding.inflate(inflater)

        val adapter = GithubMyWorkAdapter()
        binding.rvHomeGithubMywork.adapter = adapter
        binding.rvHomeGithubMywork.layoutManager = LinearLayoutManager(context)

        adapter.submitList(
            listOf(
                GithubMyWork("test","test"),
                GithubMyWork("test","test"),
                GithubMyWork("test","test"),
                GithubMyWork("test","test")
            )
        )


        return binding.root
    }


}