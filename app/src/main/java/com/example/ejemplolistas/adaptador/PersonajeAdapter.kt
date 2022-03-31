package com.example.ejemplolistas.adaptador

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ejemplolistas.Modelo.Personaje
import com.example.ejemplolistas.R
import com.squareup.picasso.Picasso

class PersonajeAdapter(val listaPersonaje:ArrayList<Personaje>):RecyclerView.Adapter<PersonajeAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.vista_personaje,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.Tvnombre.text=listaPersonaje[position].nombre
        Picasso.get().load(listaPersonaje[position].foto).into(holder.iFoto)
    }

    override fun getItemCount(): Int {//tamano de la lista
        return listaPersonaje.size
    }

    class ViewHolder(Vista: View):RecyclerView.ViewHolder(Vista){
        val Tvnombre:TextView = Vista.findViewById(R.id.tvNombre)
        val iFoto:TextView = Vista.findViewById(R.id.ivFoto)
    }
}