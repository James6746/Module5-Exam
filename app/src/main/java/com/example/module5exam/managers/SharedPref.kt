package com.example.module5exam.managers

import android.content.Context
import androidx.core.content.edit

class SharedPref(context: Context) {
    private val pref = context.getSharedPreferences("Caches", Context.MODE_PRIVATE)

    var isSaved: Boolean
        get() = pref.getBoolean("isSaved", false)
        set(value) = pref.edit {
            this.putBoolean("isSaved", value)
        }

//    fun isSaved(isSaved: Boolean){
//        val editor = pref.edit()
//        editor.putBoolean("isSaved", isSaved);
//        editor.apply()
//    }
//
//    fun getSaved(): Boolean{
//        return pref.getBoolean("isSaved", false)
//    }
}