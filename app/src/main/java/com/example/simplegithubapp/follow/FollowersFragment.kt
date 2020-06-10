package com.example.simplegithubapp.follow

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.simplegithubapp.R
import kotlinx.android.synthetic.main.fragment_followers.*

class FollowersFragment : Fragment() {
    private lateinit var rvFollowAdapter: FollowAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_followers, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        rv_followers.layoutManager = LinearLayoutManager(context)
        rvFollowAdapter = FollowAdapter(context!!)
        rv_followers.adapter = rvFollowAdapter
        rvFollowAdapter.data = arrayListOf(
            RvItemFollow(R.drawable.yuwol, "yowol", "Follow"),
            RvItemFollow(R.drawable.yuwol, "yowol", "Follow"),
            RvItemFollow(R.drawable.yuwol, "yowol", "Follow"),
            RvItemFollow(R.drawable.yuwol, "yowol", "Follow"),
            RvItemFollow(R.drawable.yuwol, "yowol", "Follow"),
            RvItemFollow(R.drawable.yuwol, "yowol", "Follow")

        )
        rvFollowAdapter.notifyDataSetChanged()


    }
}