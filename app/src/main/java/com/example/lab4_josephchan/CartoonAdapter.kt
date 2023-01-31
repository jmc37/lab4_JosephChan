package com.example.lab4_josephchan

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class CartoonAdapter(private val mList: List<String>) : RecyclerView.Adapter<com.example.lab4_josephchan.cartoon.CartoonAdapter.ViewHolder>() {

    // Holds the views
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView = view.findViewById<TextView>(R.id.textView)
    }


    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(parent.context).inflate(R.layout., parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element

        //holder.textView.text = mList[position]
    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }

}