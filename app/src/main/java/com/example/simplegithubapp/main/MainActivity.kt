package com.example.simplegithubapp.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.bumptech.glide.Glide
import com.example.simplegithubapp.R
import com.example.simplegithubapp.follow.FollowersFragment
import com.example.simplegithubapp.follow.FollowingFragment
import com.example.simplegithubapp.overview.OverviewFragment
import com.example.simplegithubapp.project.ProjectsFragment
import com.example.simplegithubapp.repository.RepositoriesFragment
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Thread.sleep

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //tab layout viewpager  연결
        val menuPagerAdapter = MenuPagerAdapter(supportFragmentManager)
        val fragments = arrayListOf<Fragment>(
            OverviewFragment(),
            RepositoriesFragment(),
            ProjectsFragment(),
            FollowersFragment(),
            FollowingFragment()
        )
        menuPagerAdapter.mData = fragments
        pager_menu.adapter = menuPagerAdapter
        tabLayout.setupWithViewPager(pager_menu)
        val menu = arrayListOf("Overview", "Repositories", "Projects", "Followers", "Following")
        for (i in 0 until menu.size)
            tabLayout.getTabAt(i)?.text = menu[i]

    }

    override fun onStart() {
        super.onStart()
        //profile img circle view
        Glide.with(this)
            .load(R.drawable.yuwol)
            .centerCrop()
            .circleCrop()
            .into(img_profile)


    }

    override fun onResume() {
        super.onResume()

        organizationInit()

        Thread{
            Log.e("Thread","쓰레드다")
            sleep(5000)
        }.start()
    }


    fun organizationInit(){
        //organization
        rv_organizations.layoutManager = GridLayoutManager(this, 4)
        val rvOrganizationListAdapter = OrganizationListAdapter()
        rv_organizations.adapter = rvOrganizationListAdapter
        val listData = listOf(
            ImgOrganization(R.drawable.yuwol),
            ImgOrganization(R.drawable.yuwol),
            ImgOrganization(R.drawable.yuwol),
            ImgOrganization(R.drawable.yuwol),
            ImgOrganization(R.drawable.yuwol),
            ImgOrganization(R.drawable.yuwol),
            ImgOrganization(R.drawable.yuwol),
            ImgOrganization(R.drawable.yuwol)
        )
        rvOrganizationListAdapter.submitList(listData)
    }
}