package com.example.newsapp.Activities

import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.newsapp.adapter.HobbiesAdapter
import com.example.newsapp.R
import com.example.newsapp.Supplier
import kotlinx.android.synthetic.main.hobbies_activity.*

class HobbiesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hobbies_activity)
        setLayoutManager()

    }
    private fun setLayoutManager(){
        val layoutmanager = LinearLayoutManager(this)
        layoutmanager.orientation = LinearLayoutManager.VERTICAL
        rcv1.layoutManager = layoutmanager
        val adapter = HobbiesAdapter(this, Supplier.hobbies)
        rcv1.adapter = adapter

    }




}