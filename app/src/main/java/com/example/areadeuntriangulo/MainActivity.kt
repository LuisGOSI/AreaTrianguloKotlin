package com.example.areadeuntriangulo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    //atributos de clase
    private lateinit var baseTr : EditText
    private lateinit var altTr : EditText
    private lateinit var btnArea : Button
    private lateinit var tvResultado : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inicializamos los atributos y los relacionamos con su elemento de la UI
        baseTr = findViewById(R.id.baseTr)
        altTr = findViewById(R.id.altTr)
        btnArea = findViewById(R.id.btnArea)
        tvResultado = findViewById(R.id.tvResultado)

        btnArea.setOnClickListener() {

            //Validamos que las cajas de texto no esten vacias
            if (baseTr.text.isEmpty() || altTr.text.isEmpty()) {
                tvResultado.text = "Debes escribir un numero entero"
            } else {

                //Declaramos variables locales para obtener los valores de las cajas de texto
                var base: Int = baseTr.text.toString().toInt()
                var altura: Int = altTr.text.toString().toInt()

                //Hacemos la operacion
                var resultado: Int = (base * altura) / 2


                // Mostramos el resultado en el TextView
                tvResultado.text = "El resultado es: $resultado"
            }
        }
    }
}