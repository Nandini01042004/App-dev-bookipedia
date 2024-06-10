package com.example.book

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.HorizontalScrollView
import android.widget.ImageButton
import android.widget.RelativeLayout

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

        val b1 = findViewById<AppCompatButton>(R.id.b11);
        b1.setOnClickListener {
            b1.setBackgroundColor(Color.WHITE)
        }
        val b2 = findViewById<AppCompatButton>(R.id.follow_button);
        b2.setOnClickListener {
            b2.setBackgroundColor(Color.BLACK)
            b2.text = " Following! "
        }

        val but_click = findViewById<ImageButton>(R.id.b1);
        but_click.setOnClickListener {
            val i = Intent(this, Content::class.java)
            startActivity(i)
        }
    }
}