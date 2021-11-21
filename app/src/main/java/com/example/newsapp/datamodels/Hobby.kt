package com.example.newsapp

data class Hobby(val text :String)
object Supplier{
    var hobbies:List<Hobby> = listOf(
        Hobby("gaming"),
        Hobby("watching anime"),
        Hobby("studying"),
        Hobby("loner"),
        Hobby("music"),
        Hobby("coding"),
        Hobby("learning new things")

    )
}
