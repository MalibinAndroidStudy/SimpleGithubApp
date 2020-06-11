package com.example.simplegithubapp.repository

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.simplegithubapp.R
import com.example.simplegithubapp.databinding.FragmentRepositoriesBinding

class RepositoriesFragment : Fragment() {
    private lateinit var binding:FragmentRepositoriesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentRepositoriesBinding.inflate(inflater,container,false)
        return binding.root
    }

}