package com.example.cadi_kotlin_study.feature

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class MenuPagerAdapter(fm:FragmentManager) : FragmentPagerAdapter(fm){
    lateinit var data: ArrayList<Fragment>

    override fun getItem(position: Int): Fragment {
        return data[position]
    }

    override fun getCount(): Int {
        return data.size
    }

}