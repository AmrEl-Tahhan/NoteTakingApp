package com.tahhan.listmaker

import android.view.View
import android.widget.Adapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TasksListViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView) {
    val taskTextView = itemView.findViewById(R.id.textView_task) as TextView
}