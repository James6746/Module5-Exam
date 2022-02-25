package com.example.facebookjava

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.module5exam.R
import com.example.module5exam.model.Story
import com.google.android.material.imageview.ShapeableImageView

class StoryAdapter(val context: Context, var stories: ArrayList<Story>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_story, parent, false)
        return StoryViewHolder(view)

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val story: Story = stories[position]
        if (holder is StoryViewHolder) {
            holder.iv_background.setImageResource(story.img)
            holder.tv_name.setText(story.name)
        }
    }

    override fun getItemCount(): Int {
        return stories.size
    }

    inner class StoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var iv_background: ShapeableImageView
        var tv_name: TextView

        init {
            iv_background = itemView.findViewById(R.id.iv_background)
            tv_name = itemView.findViewById(R.id.name)
        }
    }


}