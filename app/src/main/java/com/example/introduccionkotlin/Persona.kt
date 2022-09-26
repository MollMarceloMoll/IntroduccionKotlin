package com.example.introduccionkotlin

class Persona(var name: String ="Anonimo", var passport: String? = null) {

    fun Persona(){
        name = "Marcelo"
        passport = "Canada"
    }
}