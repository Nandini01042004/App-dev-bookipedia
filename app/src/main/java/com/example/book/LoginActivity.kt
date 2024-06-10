package com.example.book

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val but_click = findViewById<AppCompatButton>(R.id.create);
        but_click.setOnClickListener {
            val i = Intent(this, Create::class.java)
            startActivity(i)
        }

        val butt_click = findViewById<AppCompatButton>(R.id.signup);
        butt_click.setOnClickListener {
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }


    }
}