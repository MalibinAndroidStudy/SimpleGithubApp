package com.example.cadi_kotlin_study

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.cadi_kotlin_study.feature.MenuPagerAdapter
import com.example.cadi_kotlin_study.feature.follower_list.FollowerFragment
import com.example.cadi_kotlin_study.feature.repository_list.RepoFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        configureMenuTab()
    }

    private fun configureMenuTab(){
        val fragments = arrayListOf<Fragment>(RepoFragment(),FollowerFragment())
        val menuPagerAdapter = MenuPagerAdapter(supportFragmentManager)
        menuPagerAdapter.data = fragments
        vp_menu.adapter = menuPagerAdapter
        tl_menu.setupWithViewPager(vp_menu)

        val menu = arrayListOf("Repositories","Follow")
        for(i in 0..menu.size){
            tl_menu.getTabAt(i)?.text = menu[i]
        }


    }
}
