package com.example.introduccionkotlin

open class Persona (var name: String = "Anonimo", var passport: String? = null) {
    var alive : Boolean = true

    fun Persona () {
        name = "Marc"
        passport = "BSE45454"
    }
    fun die () {
        alive = false
    }
}

class Athlete (name: String, passport: String?, var sport: String): Persona (name, passport)