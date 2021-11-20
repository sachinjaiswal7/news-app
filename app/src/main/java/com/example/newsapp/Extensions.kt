package com.example.newsapp

import android.app.Activity
import android.content.Context
import android.widget.Toast

fun Context.MakeToast(msg :String?){
    Toast.makeText(this,msg, Toast.LENGTH_SHORT).show()
}