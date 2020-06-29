package com.example.simplegithubapp.follow

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.simplegithubapp.R
import com.example.simplegithubapp.databinding.FragmentFollowingBinding
import kotlinx.android.synthetic.main.fragment_following.*

class FollowingFragment : Fragment() {
    private lateinit var binding:FragmentFollowingBinding
    private lateinit var rvFollowingAdapter: FollowListAdpater

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
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initFollowing()

    }


    private fun initFollowing(){
        rv_followering?.layoutManager = LinearLayoutManager(context)
        rvFollowingAdapter = FollowListAdpater()
        rv_followering?.adapter = rvFollowingAdapter
        rvFollowingAdapter.submitList(   arrayListOf(
            RvItemFollow(R.drawable.ggami, "ggami", "Follow"),
            RvItemFollow(R.drawable.ggami, "ggami", "Follow"),
            RvItemFollow(R.drawable.ggami, "ggami", "Follow"),
            RvItemFollow(R.drawable.ggami, "ggami", "Follow"),
            RvItemFollow(R.drawable.ggami, "ggami", "Follow"),
            RvItemFollow(R.drawable.ggami, "ggami", "Follow") )

        )
        // rvFollowingAdapter.notifyDataSetChanged()
    }

}