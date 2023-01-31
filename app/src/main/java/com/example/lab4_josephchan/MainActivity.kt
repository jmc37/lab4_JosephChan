package com.example.lab4_josephchan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import androidx.recyclerview.widget.RecyclerView.findNestedRecyclerView
import kotlinx.coroutines.NonDisposableHandle.parent
import java.text.FieldPosition

class Cartoon(name: String, resourceId: Int){

}

//class RegisterViewForEvents(private val view: View) {
//    var cartoon: Cartoon? = null
//
//    init {
//        view.setOnClickListener {
//            val nameTextView = view.findViewById<TextView>(R.id.text_cartoon_name)
//            nameTextView.text = cartoon?.name
//        }
//
//        view.setOnLongClickListener {
//            val imageView = view.findViewById<ImageView>(R.id.image_cartoon)
//            imageView.setImageResource(cartoon?.resourceId ?: 0)
//            true
//        }
//    }
//}

private fun setupRecyclerView(){
    val recyclerView = findViewById<RecyclerView>(R.id.recyclerView_main)
    val data = arrayListOf<Cartoon>()
}
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}