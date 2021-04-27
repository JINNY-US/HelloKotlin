package com.example.hellokotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    //var btnHello : Button
    //초기화가 필요

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var intent : Intent

        val btnKotlin = findViewById<Button>(R.id.btnKotlin)
        btnKotlin.setOnClickListener {
            intent = Intent(this@MainActivity, BmiKotlinActivity::class.java)
        }

        val btnJava = findViewById<Button>(R.id.btnJava)
        btnJava.setOnClickListener {
            intent = Intent(this@MainActivity, BmiJavaActivity::class.java)
            startActivity(intent)
        }
    }
}