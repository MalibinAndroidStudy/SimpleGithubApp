package com.example.githubproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.githubproject.ui.home.FragmentHome
import com.example.githubproject.ui.notifications.NotificationsFragment
import com.example.githubproject.ui.search.SearchFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private val fragmentHome = FragmentHome()
    private val fragmentNotification = NotificationsFragment()
    private val fragmentSearch = SearchFragment()
    private var active : Fragment = fragmentHome

    private lateinit var mainBottomNavi: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainBottomNavi = findViewById(R.id.bottom_navi)

        supportFragmentManager.beginTransaction().add(R.id.main_fragment_layout, fragmentHome).commit()
        supportFragmentManager.beginTransaction().add(R.id.main_fragment_layout, fragmentNotification).hide(fragmentNotification).commit()
        supportFragmentManager.beginTransaction().add(R.id.main_fragment_layout, fragmentSearch).hide(fragmentSearch).commit()

        fragmentSetting()
    }
    fun fragmentSetting() {
        mainBottomNavi.setOnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.homeFragment -> {
                    supportFragmentManager.beginTransaction().hide(active).show(fragmentHome).commit()
                    active = fragmentHome
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.notificationsFragment -> {
                    supportFragmentManager.beginTransaction().hide(active)
                        .show(fragmentNotification).commit()
                    active = fragmentNotification
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.searchFragment -> {
                    supportFragmentManager.beginTransaction().hide(active)
                        .show(fragmentSearch).commit()
                    active = fragmentSearch
                    return@setOnNavigationItemSelectedListener true
                }
            }
            false
        }
    }
}
