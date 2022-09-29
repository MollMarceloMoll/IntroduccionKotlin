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
class Datos (var age: Int, var altura: Int, var peso: Int) : Persona (name, passport)
class Athlete (name: String, passport: String?, var sport: String): Persona (name, passport)

//class Datee (var age: Int, var height: Int): Persona (name, passport)