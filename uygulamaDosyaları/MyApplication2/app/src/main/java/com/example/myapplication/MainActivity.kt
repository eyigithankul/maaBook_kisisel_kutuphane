package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.loginBtn)

        button.setOnClickListener{
            val intent = Intent(this,MainActivity2::class.java)

            startActivity(intent)
        }

        val button2 = findViewById<Button>(R.id.skipBtn)

        button2.setOnClickListener{
            val intentt = Intent(this,noGiris::class.java)

            startActivity(intentt)
        }
    }
}