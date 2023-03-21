package com.example.projetoa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView
import androidx.appcompat.widget.Toolbar

class resultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val text_Inicio:TextView= findViewById(R.id.text_Result)
        val text_class: TextView=findViewById(R.id.text_classe)
        val resultado =intent.getFloatExtra("RESULTADO", 0.1f)
        text_Inicio.text=resultado.toString()

        var classifica =""

        if(resultado <18.5f){
            classifica="Classificação:Abaixo do peso, procure ajuda profissional !"
        }else if (resultado in 18.5f..24.9f ){
            classifica="Classificação:Índice normal, mantenha uma rotina de bons hábitos!"
        }else if (resultado in 25f..29.9f){
            classifica="Classificação:Sobrepeso, desenvolva bons hábitos!"
        }else if (resultado in 30f..39.9f){
            classifica="Classificação:Obesidade, procure ajuda profissional!"
        } else {
            classifica = "Classificação:Obesidade grave, procure ajuda profissional urgente!"
        }
            text_class.text= classifica
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return super.onOptionsItemSelected(item)
    }
}