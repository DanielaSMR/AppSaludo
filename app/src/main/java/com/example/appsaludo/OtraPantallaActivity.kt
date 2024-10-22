package com.example.appsaludo

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class OtraPantallaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_otra_pantalla)
        val tvGreeting: TextView = findViewById(R.id.tvGreeting)
        val name:String = intent.extras?.getString("EXTRA_NAME").orEmpty()
        tvGreeting.text = "Hola $name"
    }
}