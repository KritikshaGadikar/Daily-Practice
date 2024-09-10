package com.example.kotlintodolistproject

data class Todo(
    val title: String,
    var isChecked: Boolean = false
)