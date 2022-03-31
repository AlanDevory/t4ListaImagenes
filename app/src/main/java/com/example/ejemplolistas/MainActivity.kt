package com.example.ejemplolistas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejemplolistas.Modelo.Personaje

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listaPersonaje=ArrayList<Personaje>()

        listaPersonaje.add(Personaje("blackover","https://cdn-e360.s3-sa-east-1.amazonaws.com/las-5-plataformas-de-streaming-ideales-para-ver-anime-large-GtPhgNYLdn.jpg"))
        listaPersonaje.add(Personaje("Jujutsu Kaisen","https://media.timeout.com/images/105528586/750/422/image.jpg"))
    }
}