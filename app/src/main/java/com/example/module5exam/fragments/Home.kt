package com.example.module5exam.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.facebookjava.StoryAdapter
import com.example.module5exam.R
import com.example.module5exam.model.Story

class Home : Fragment() {

    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_home, container, false)
        recyclerView = view.findViewById(R.id.recyclerStory)

        val adapter = StoryAdapter(view.context, getAllStories())
        recyclerView.adapter = adapter

        return view
    }

    fun getAllStories(): ArrayList<Story> {
        val stories: ArrayList<Story> = ArrayList()

        stories.add(Story(R.drawable.james, "Restaurant"))
        stories.add(Story(R.drawable.james, "Restaurant"))
        stories.add(Story(R.drawable.james, "Restaurant"))
        stories.add(Story(R.drawable.james, "Restaurant"))
        stories.add(Story(R.drawable.james, "Restaurant"))
        stories.add(Story(R.drawable.james, "Restaurant"))
        stories.add(Story(R.drawable.james, "Restaurant"))
        stories.add(Story(R.drawable.james, "Restaurant"))
        stories.add(Story(R.drawable.james, "Restaurant"))

        return stories
    }
}