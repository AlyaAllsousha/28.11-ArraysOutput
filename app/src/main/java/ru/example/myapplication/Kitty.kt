package ru.example.myapplication

import android.graphics.Bitmap

data class Kitty(
    val color: String= "invisible",
    val name: String = "kot",
    val poroda: String = "Scotland Downears",
    var image:Bitmap? = null
) {
}