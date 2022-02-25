package com.example.module5exam.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.module5exam.fragments.Page1
import com.example.module5exam.fragments.Page2
import com.example.module5exam.fragments.Page3
import com.example.module5exam.fragments.Page4

class FragmentAdapter(val fragmentManager: FragmentManager, val lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int {
        return 4
    }

    override fun createFragment(position: Int): Fragment {

        when (position) {
            0 -> return Page1()
            1 -> return Page2()
            2 -> return Page3()
        }
        return Page4()
    }

}
