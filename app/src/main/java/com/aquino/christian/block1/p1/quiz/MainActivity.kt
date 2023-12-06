package com.aquino.christian.block1.p1.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var button : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.btnClick)

        button.setOnClickListener {
            intent = Intent(this@MainActivity, HelloWorldActivity::class.java)
            startActivity(intent)
        }
    }
}