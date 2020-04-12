package com.tahhan.listmaker

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Adapter
import androidx.recyclerview.widget.RecyclerView

class TasksListAdapter(var list: TaskList): RecyclerView.Adapter<TasksListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TasksListViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.task_view_holder,parent,false)
        return TasksListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.tasks.size
    }

    override fun onBindViewHolder(holder: TasksListViewHolder, position: Int) {
        holder.taskTextView.text = list.tasks[position]
    }
}