package com.example.module5exam.activities

import android.content.Intent
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.module5exam.R
import com.example.module5exam.adapters.FragmentAdapter
import com.example.module5exam.managers.SharedPref
import me.relex.circleindicator.CircleIndicator3

class IntroActivity : AppCompatActivity() {

    lateinit var viewPager2: ViewPager2
    lateinit var fragmentAdapter: FragmentAdapter
    lateinit var tv_skip: TextView
    lateinit var tv_next_done: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        initViews()
    }

    private fun initViews() {
        viewPager2 = findViewById(R.id.viewPager2)
        val circleIndicator3 = findViewById<CircleIndicator3>(R.id.circleIndicator)
        tv_skip = findViewById(R.id.tv_skip)
        tv_next_done = findViewById(R.id.tv_next)

        fragmentAdapter = FragmentAdapter(supportFragmentManager, lifecycle)
        viewPager2.adapter = fragmentAdapter
        circleIndicator3.setViewPager(viewPager2)

        tv_skip.setOnClickListener{
            viewPager2.currentItem = 3
        }

        tv_next_done.setOnClickListener{
            if(tv_next_done.text.toString().equals("Done")){
                SharedPref(this).isSaved = true
                Intent(applicationContext, MainActivity::class.java).also {
                    startActivity(it)
                }
            }
            viewPager2.setCurrentItem(viewPager2.currentItem + 1, true)
        }

        viewPager2.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {

            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)

                if(position == 3){
                    tv_next_done.setText("Done")
                } else {
                    tv_next_done.setText("Next")
                }
            }
        })




    }

}