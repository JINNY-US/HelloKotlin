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

        //var intent : Intent

        val btnJava = findViewById<Button>(R.id.btnJava)
        val btnKotlin = findViewById<Button>(R.id.btnKotlin)

        val btnVarJava = findViewById<Button>(R.id.btnVarJava)
        val btnVarKotlin = findViewById<Button>(R.id.btnVarKotlin)

        btnJava.setOnClickListener {
            //intent = Intent(this@MainActivity, BmiJavaActivity::class.java)
            startActivity(Intent(this@MainActivity, BmiJavaActivity::class.java)
            )
        }
        btnKotlin.setOnClickListener {
            //intent = Intent(this@MainActivity, BmiKotlinActivity::class.java)
            startActivity(Intent(this@MainActivity, BmiKotlinActivity::class.java)
            )
        }

        btnVarJava.setOnClickListener {
            //intent = Intent(this@MainActivity, VariableJavaActivity::class.java)
            startActivity(Intent(this@MainActivity, VariableJavaActivity::class.java)
            )
        }
        btnVarKotlin.setOnClickListener {
            //intent = Intent(this@MainActivity, VariableKotlinActivity::class.java)
            startActivity(Intent(this@MainActivity, VariableKotlinActivity::class.java)
            )
        }
    }
}