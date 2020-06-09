package com.example.simplegithubapp.main

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.simplegithubapp.follow.FollowingFragment
import com.example.simplegithubapp.project.ProjectsFragment
import com.example.simplegithubapp.repository.RepositoriesFragment
import com.example.simplegithubapp.follow.FollowersFragment
import com.example.simplegithubapp.overview.OverviewFragment

class MenuPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    var overview:Fragment=
        OverviewFragment()
    var repositories:Fragment=
        RepositoriesFragment()
    var projects:Fragment= ProjectsFragment()
    var followers:Fragment=
        FollowersFragment()
    var following:Fragment=
        FollowingFragment()

    var mData:ArrayList<Fragment> = arrayListOf(overview,repositories,projects,followers,following)

    override fun getItem(position: Int): Fragment {
        return mData.get(position)
    }

    override fun getCount(): Int {
        return mData.size
    }


}