package com.example.githubproject.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.githubproject.data.GithubMyWork
import com.example.githubproject.databinding.FragmentHomeBinding
import com.example.githubproject.ui.home.adapter.GithubMyWorkAdapter


class FragmentHome : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentHomeBinding.inflate(inflater)

        val adapter = GithubMyWorkAdapter()

        binding.rvHomeGithubMywork.adapter = adapter

        adapter.submitList(GithubMyWork.MyworkSubdatas)

        return binding.root
    }

}