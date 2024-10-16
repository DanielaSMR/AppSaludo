package com.example.appsaludo

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {


    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val etName:AppCompatEditText = findViewById(R.id.etName)
        val btnHello:AppCompatButton = findViewById(R.id.btnHello)
        btnHello.setOnClickListener {
                val name = etName.text.toString()
                //Log.i("Test", "Boton Pulsado")
                //Toast.makeText(this,"Hola $name!", Toast.LENGTH_LONG).show()
            if(name.isNotEmpty()){
                Snackbar.make(btnHello,"Hola $name!", Snackbar.LENGTH_SHORT)
                    .setAnchorView(btnHello)
                    .setAction("CLOSE"){finishAffinity()}
                    .show()
            }
        }
    }
}