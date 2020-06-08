package com.example.simplegithubapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var rvOrganizationAdapter: OrganizationAdapter
    private lateinit var rvOrganizationListAdapter: OrganizationListAdapter
    private lateinit var menuPagerAdapter: MenuPagerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        menuPagerAdapter =MenuPagerAdapter(supportFragmentManager)
        pager_menu.adapter=menuPagerAdapter
        tabLayout.setupWithViewPager(pager_menu)
        val menu= arrayListOf("Overview","Repositories","Projects","Followers","Following")
        for (i in 0 until menu.size)
            tabLayout.getTabAt(i)?.text = menu[i]




        rv_organizations.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        rvOrganizationAdapter= OrganizationAdapter(this)
        rv_organizations.adapter=rvOrganizationAdapter
        rvOrganizationListAdapter=OrganizationListAdapter()
        rv_organizations.adapter=rvOrganizationListAdapter
         val listData=listOf(
            ImgOrganization(R.color.colorBlack),
            ImgOrganization(R.color.colorPointBlue),
            ImgOrganization(R.color.colorPointRed),
            ImgOrganization(R.color.colorPointGray))
        rvOrganizationAdapter.data=listData
        rvOrganizationListAdapter.submitList(listData)
        rvOrganizationAdapter.notifyDataSetChanged()



    }
}