package com.example.multipleactivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val info=intent.extras?.get("info") as ArrayList<String>
        recyclerView.adapter=RVAdapter(info)
        recyclerView.layoutManager=LinearLayoutManager(this)

    }
}