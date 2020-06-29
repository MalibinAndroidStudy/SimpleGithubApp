package com.example.simplegithubapp.overview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.simplegithubapp.databinding.FragmentOverviewBinding
import kotlinx.android.synthetic.main.fragment_overview.*

class OverviewFragment : Fragment() {

    private lateinit var binding:FragmentOverviewBinding
    private lateinit var rvOverviewListAdapter: OverviewListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding=FragmentOverviewBinding.inflate(inflater,container,false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rvOverviewInit()
    }

    private fun rvOverviewInit(){
        rv_overview.layoutManager=LinearLayoutManager(context)
        rvOverviewListAdapter= OverviewListAdapter()
        rv_overview.adapter=rvOverviewListAdapter
        val listData= listOf(
           // RvItemOverview("BOJ_Algorithm","BOJ Algorithm exercise using Kotlin","Kotlin",3,4),
            RvItemOverview("CareDirection/CareDirection-Android", "CareDirection-Android","Kotlin",3,4),
            RvItemOverview("CareDirection/CareDirection-Android", "CareDirection-Android","Kotlin",3,4),
            RvItemOverview("CareDirection/CareDirection-Android", "CareDirection-Android","Kotlin",3,4),
            RvItemOverview("CareDirection/CareDirection-Android", "CareDirection-Android","Kotlin",3,4),
            RvItemOverview("CareDirection/CareDirection-Android", "CareDirection-Android","Kotlin",3,4)
        )
        rvOverviewListAdapter.submitList(listData)


    }
}