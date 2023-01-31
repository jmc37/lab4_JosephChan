package com.example.lab4_josephchan

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CartoonAdapter(private val cartoons: List<Cartoon>) :
    RecyclerView.Adapter<CartoonAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById<ImageView>(R.id.image_cartoon)
        val nameTextView: TextView = itemView.findViewById<TextView>(R.id.text_cartoon_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_cartoon, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val cartoon = cartoons[position]
        holder.imageView.setImageResource(cartoon.resourceId)
        holder.nameTextView.text = cartoon.name
        RegisterViewForEvents(holder.itemView).cartoon = cartoon
    }

    override fun getItemCount(): Int = cartoons.size
}


}