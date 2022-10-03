package com.example.introduccionkotlin

class Ticket constructor(var name: String, var coder: Float, var position: String, var payment: Boolean){

    fun register (): String {
        return "Register"
    }
}