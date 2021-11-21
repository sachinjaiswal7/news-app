package com.example.newsapp

import android.app.Activity
import android.content.Context
import android.widget.Toast

fun Context.MakeToast(msg :String?,length:Int = Toast.LENGTH_SHORT){
    Toast.makeText(this,msg, length).show()
}
