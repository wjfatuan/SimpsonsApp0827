package com.example.simpsonsapp0827

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btnHomer: Button = findViewById(R.id.btnHomer)
        btnHomer.setOnClickListener {
            changeImage("homer")
        }
        val btnBart: Button = findViewById(R.id.btnBart)
        btnBart.setOnClickListener {
            changeImage("bart")
        }
        val btnMarge: Button = findViewById(R.id.btnMarge)
        btnMarge.setOnClickListener {
            changeImage("marge")
        }
    }

    fun changeImage(name: String) {
        val imgSimpson : ImageView = findViewById(R.id.imgSimpson)
        val id = resources.getIdentifier(name, "drawable", packageName)
        imgSimpson.setImageResource(id)
    }

}