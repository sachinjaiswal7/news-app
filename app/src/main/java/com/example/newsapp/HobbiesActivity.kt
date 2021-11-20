package com.example.newsapp

import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.hobbies_activity.*

class HobbiesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hobbies_activity)
        val layoutmanager = LinearLayoutManager(this)
        layoutmanager.orientation = LinearLayoutManager.VERTICAL
        rcv1.layoutManager = layoutmanager
        val adapter = HobbiesAdapter(this,Supplier.hobbies)
        rcv1.adapter = adapter

    }
    val imagebutton = findViewById<ImageButton>(R.id.imageButton)


}