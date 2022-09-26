package com.example.introduccionkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var a: Persona = Persona(name = "Marcelo", passport = "Argentino")
        var b: Persona = Persona()
        println(a.name)
        println(a.passport)

        b.Persona()
        println(b.name)
        println(b.passport)

       var c: Pokemon = Pokemon()
    }
}