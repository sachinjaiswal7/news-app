package com.example.newsapp.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.newsapp.MakeToast
import com.example.newsapp.R


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




    }

    fun sendtoList(view: View) {

        val intent = Intent(this, HobbiesActivity::class.java)
        MakeToast(getString(R.string.you_are_redirected_to_new_page))
        startActivity(intent)

    }


}


