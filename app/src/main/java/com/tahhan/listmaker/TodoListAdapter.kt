package com.tahhan.listmaker

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter

class TodoListAdapter(private val lists: ArrayList<TaskList>,val clickListener: TodoListClickListener) : Adapter<TodoListViewHolder>() {

    interface TodoListClickListener{
        fun listItemClicked(taskList: TaskList)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoListViewHolder {
      val view = LayoutInflater.from(parent.context)
          .inflate(R.layout.todo_list_view_holder,parent,false)
        return TodoListViewHolder(view)
    }

    override fun getItemCount(): Int {
       return lists.size
    }

    override fun onBindViewHolder(holder: TodoListViewHolder, position: Int) {
          holder.listPositionTextView.text = (position+1).toString()
        holder.listTitleTextView.text = lists[position].name
        holder.itemView.setOnClickListener {
            clickListener.listItemClicked(lists[position])
        }

    }


    fun addList(list: TaskList) {
        lists.add(list)
        notifyItemChanged(lists.size-1)
    }
}