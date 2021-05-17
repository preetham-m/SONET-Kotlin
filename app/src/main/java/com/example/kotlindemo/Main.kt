package com.example.kotlindemo

fun main(){
    val n = 11

    var a = 1..10

    if(n !in a){
        print("a not in range")
    }
}