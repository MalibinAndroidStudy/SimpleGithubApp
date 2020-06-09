package com.example.simplegithubapp.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.bumptech.glide.Glide
import com.example.simplegithubapp.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var rvOrganizationAdapter: OrganizationAdapter
    private lateinit var rvOrganizationListAdapter: OrganizationListAdapter
    private lateinit var menuPagerAdapter: MenuPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //tab layout viewpager  연결
        menuPagerAdapter = MenuPagerAdapter(
            supportFragmentManager
        )
        pager_menu.adapter = menuPagerAdapter
        tabLayout.setupWithViewPager(pager_menu)
        val menu = arrayListOf("Overview", "Repositories", "Projects", "Followers", "Following")
        for (i in 0 until menu.size)
            tabLayout.getTabAt(i)?.text = menu[i]



        //organization
        rv_organizations.layoutManager = GridLayoutManager(this, 4)
        rvOrganizationAdapter =
            OrganizationAdapter(this)
        rv_organizations.adapter = rvOrganizationAdapter
        rvOrganizationListAdapter =
            OrganizationListAdapter()
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
        rvOrganizationAdapter.data = listData
        rvOrganizationListAdapter.submitList(listData)
        rvOrganizationAdapter.notifyDataSetChanged()

        //profile img circle view
        Glide.with(this)
            .load(R.drawable.yuwol)
            .centerCrop()
            .circleCrop()
            .into(img_profile)


    }
}