package com.example.meuapp
import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnTesta = findViewById<Button>(R.id.btnTesta)
        btnTesta.setOnClickListener{
            Toast.makeText(applicationContext,"Olá mundo",Toast.LENGTH_SHORT).show()
        }
    }
}