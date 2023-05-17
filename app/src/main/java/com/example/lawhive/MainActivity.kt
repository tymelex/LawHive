package com.example.lawhive

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cardhomepage = findViewById<CardView>(R.id.btnhome)
        cardhomepage.setOnClickListener {
            startActivity(
                Intent(
                    this@MainActivity,
                    Majour::class.java
                )
            )
        }
    }
}