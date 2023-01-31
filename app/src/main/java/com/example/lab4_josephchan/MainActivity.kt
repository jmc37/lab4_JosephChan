package com.example.lab4_josephchan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import kotlinx.coroutines.NonDisposableHandle.parent
import java.text.FieldPosition

class Cartoon(name: String, resourceId: Int){

}

class RegisterViewForEvents(ItemView: View) : RecyclerView.ViewHolder(ItemView){
    val textView = View.findViewById<TextView>(R.id.textView)
}

fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder{
         val view =LayoutInflater.from(parent.context).inflate(R.layout.item_cartoon, parent, false)
          return ViewHolder(View)
    }

    fun onBindViewHolder(holder: ViewHolder, position: Int){
        holder.textView.text = mlist[position]
    }
}

class CartoonAdapter(){

}
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}