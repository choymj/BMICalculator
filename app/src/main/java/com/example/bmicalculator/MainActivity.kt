package com.example.bmicalculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnEnter: Button = findViewById(R.id.btnEnter)

        btnEnter.setOnClickListener{

            val tvName = findViewById<TextView>(R.id.editTextTextPersonName)

            val intent = Intent(this@MainActivity, MainActivity2::class.java)

            intent.putExtra("personName", tvName.text.toString())
            startActivity(intent)
        }
    }
}