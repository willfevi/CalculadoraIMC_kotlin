package com.example.projetoa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
            override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            val btnCalcular:Button=  findViewById(R.id.button_Calcul)
            val edit_Altura: EditText= findViewById(R.id.edtAltura)
            val edit_Peso:EditText= findViewById(R.id.edtPeso)

                btnCalcular.setOnClickListener {
                    val pesoStr=edit_Peso.text.toString()
                    val alturaStr=edit_Altura.text.toString()
                    if (alturaStr.isNotEmpty()&&pesoStr.isNotEmpty()){
                    val peso:Float=pesoStr.toFloat()
                    val altura :Float=alturaStr.toFloat()
                    val alturaF:Float = altura * altura
                    val result: Float= peso / alturaF
                    val tela2 = Intent(this, resultActivity::class.java)
                        .apply {
                            putExtra("RESULTADO",result)
                        }
                    startActivity(tela2)
                     } else {
                        Toast.makeText(this, "Preencha todos os campos acima.", Toast.LENGTH_SHORT).show()
                    }

                }


    }

}