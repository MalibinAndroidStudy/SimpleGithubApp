package com.example.cadi_kotlin_study.feature.follower_list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import com.example.cadi_kotlin_study.R
import com.example.cadi_kotlin_study.data.follower.DummyFollower
import kotlinx.android.synthetic.main.fragment_follower.*


class FollowerFragment : Fragment() {
    private lateinit var followerListAdapter : FollowerListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        followerInit()
    }

    private fun followerInit(){
        followerListAdapter = FollowerListAdapter()

        rv_follower_list.adapter = followerListAdapter

        rv_follower_list.layoutManager = LinearLayoutManager(context)

        followerListAdapter.submitList(DummyFollower.getFollowerList())
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_follower, container, false)
    }
}
