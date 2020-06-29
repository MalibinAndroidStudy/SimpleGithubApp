package com.example.simplegithubapp.follow

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.simplegithubapp.R
import com.example.simplegithubapp.databinding.FragmentFollowersBinding
import kotlinx.android.synthetic.main.fragment_followers.*

class FollowersFragment : Fragment() {
    private lateinit var binding:FragmentFollowersBinding
    private lateinit var rvFollowAdapter: FollowListAdpater

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding=FragmentFollowersBinding.inflate(inflater,container,false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rvFollowerInit()
    }

    fun rvFollowerInit(){

        rv_followers.layoutManager = LinearLayoutManager(context)
        rvFollowAdapter = FollowListAdpater()
        rv_followers.adapter = rvFollowAdapter
        rvFollowAdapter.submitList( arrayListOf(
            RvItemFollow(R.drawable.yuwol, "yowol", "Follow"),
            RvItemFollow(R.drawable.yuwol, "yowol", "Follow"),
            RvItemFollow(R.drawable.yuwol, "yowol", "Follow"),
            RvItemFollow(R.drawable.yuwol, "yowol", "Follow"),
            RvItemFollow(R.drawable.yuwol, "yowol", "Follow"),
            RvItemFollow(R.drawable.yuwol, "yowol", "Follow") )
        )
    }
}