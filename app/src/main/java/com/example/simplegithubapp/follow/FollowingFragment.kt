package com.example.simplegithubapp.follow

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.simplegithubapp.R
import com.example.simplegithubapp.databinding.FragmentFollowingBinding

class FollowingFragment : Fragment() {
    private lateinit var binding:FragmentFollowingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentFollowingBinding.inflate(inflater,container,false)
        return inflater.inflate(R.layout.fragment_following, container, false)
    }

}