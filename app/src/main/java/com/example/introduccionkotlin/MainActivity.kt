package com.example.introduccionkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var a: Persona = Persona(name = "Marcelo", passport = "AQQW7874")
        var b: Persona = Persona()
        println(a.alive)
        println(a.name)
        println(a.passport)

        b.Persona()
        b.name = "Marc"
        println(b.alive)
        println(b.name)
        println(b.passport)

        var messi: Athlete = Athlete(name = "Messi", passport = "ERT4848", sport = "Futbol")

        println(messi.alive)
        println(messi.name)
        println(messi.passport)
        println(messi.sport)

       var c: Pokemon = Pokemon()
    }
}