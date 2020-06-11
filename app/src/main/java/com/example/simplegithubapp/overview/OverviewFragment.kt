package com.example.simplegithubapp.overview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.simplegithubapp.databinding.FragmentOverviewBinding

class OverviewFragment : Fragment() {

    private lateinit var binding:FragmentOverviewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        //inflater.inflate(R.layout.fragment_overview, container, false)
        binding=FragmentOverviewBinding.inflate(inflater,container,false)
        return binding.root
    }
}