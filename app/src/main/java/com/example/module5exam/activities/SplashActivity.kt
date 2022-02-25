package com.example.module5exam.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.module5exam.R
import com.example.module5exam.managers.SharedPref

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val handler = Handler()
        handler.postDelayed({
            if(SharedPref(this).isSaved){
                Intent(applicationContext, MainActivity::class.java).also {
                    startActivity(it)
                }
            } else {
                Intent(this, IntroActivity::class.java).also {
                    startActivity(it)
                }
            }
        },1000)
    }
}