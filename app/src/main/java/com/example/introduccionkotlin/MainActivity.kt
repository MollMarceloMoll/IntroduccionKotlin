package com.example.introduccionkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var a: Persona = Persona(name = "Marcelo", passport = "AQUA7874")
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

        var messii: Info = Info (name ="Messi", passport ="ERT4848", age = 35, altura =1.60f, peso = 65 )

        println(messii.alive)
        println(messii.name)
        println(messii.passport)
        println(messi.sport)
        println(messii.age)
        println(messii.altura)
        println(messii.peso)

        var mesi : Car = Car (name = "Messi", vehicle = "Mercedes Benz")

        println(mesi.name)
        println(mesi.vehicle)


       //var c: Pokemon = Pokemon()

        var tic : Ticket = Ticket(name = "Marcelo", coder = 10f, position = "Nort", payment = true)
        println(tic.name)
        println(tic.coder)
        println(tic.position)
        println(tic.payment)
        println(tic.register())
    }
}