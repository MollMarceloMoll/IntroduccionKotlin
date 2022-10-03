package com.example.introduccionkotlin

class Ticket constructor(name: String, coder: Float,position: String, payment: Boolean){
    var name: String = "Admin"
    var coder: Float = 00001f
    var position: String = "Nort"
    var payment: Boolean = true

    fun register (): String {
        return "Register"
    }
}