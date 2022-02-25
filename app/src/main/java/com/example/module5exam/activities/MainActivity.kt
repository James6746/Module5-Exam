package com.example.module5exam.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
import com.example.module5exam.R
import com.example.module5exam.adapters.MainFragmentAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener

class MainActivity : AppCompatActivity() {

    lateinit var tabLayout: TabLayout
    lateinit var viewPager2: ViewPager2
    lateinit var mainFragmentAdapter: MainFragmentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        tabLayout = findViewById(R.id.tabLayout)
        viewPager2 = findViewById(R.id.main_viewPager2)

        val fragmentManager = supportFragmentManager
        mainFragmentAdapter = MainFragmentAdapter(fragmentManager, lifecycle)
        viewPager2.adapter = mainFragmentAdapter


        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_baseline_home_24))
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.sort))
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.chat))
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.loupe))

        tabLayout.addOnTabSelectedListener(object : OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                viewPager2.currentItem = tab.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {
            }

            override fun onTabReselected(tab: TabLayout.Tab) {
            }
        })

        viewPager2.registerOnPageChangeCallback(object : OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                tabLayout.selectTab(tabLayout.getTabAt(position))
            }
        })

    }
}