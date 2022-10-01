package com.example.introduccionkotlin

class Ticket constructor(name: String, coder: Float,position: String){
    var name: String = "Admin"
    var coder: Float = 00001f
    var position: String = "Nort"

    fun register (): String {
        return "Register"
    }
}