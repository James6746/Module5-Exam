package com.example.module5exam.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.module5exam.fragments.Collections
import com.example.module5exam.fragments.Home
import com.example.module5exam.fragments.Messages
import com.example.module5exam.fragments.Search

class MainFragmentAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> return Home()
            1 -> return Collections()
            2 -> return Messages()

        }
        return Search()
    }

    override fun getItemCount(): Int {
        return 4
    }
}
