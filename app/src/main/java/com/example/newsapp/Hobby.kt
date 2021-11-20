package com.example.newsapp

data class Hobby(val text :String)
object Supplier{
    val hobbies = listOf<Hobby>(
        Hobby("gaming"),
        Hobby("watching anime"),
        Hobby("studying"),
        Hobby("loner"),
        Hobby("music"),
        Hobby("coding"),
        Hobby("learning new things")

    )
}
