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
    private lateinit var followerAdapter : FollowerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        followerAdapter = FollowerAdapter(context)

        rv_follower_list.adapter = followerAdapter

        rv_follower_list.layoutManager = LinearLayoutManager(context)

        followerAdapter.data = DummyFollower.getFollowerList()

        followerAdapter.notifyDataSetChanged()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_follower, container, false)
    }
}
