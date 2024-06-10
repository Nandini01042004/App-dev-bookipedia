package com.example.book

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.BitmapFactory
import android.graphics.Color
import android.os.Bundle
import android.text.SpannableString
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.marginLeft

class Content : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_content)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val but = findViewById<AppCompatButton>(R.id.add_bk);
        but.setOnClickListener {
            but.setTextColor(Color.LTGRAY)
        }

        val butt = findViewById<AppCompatButton>(R.id.helpful);
        butt.setOnClickListener {
            butt.text=" Thank you for your feedback"
            butt.setTextColor(Color.GREEN)
        }
        val but_click = findViewById<ImageButton>(R.id.back_btn);
        but_click.setOnClickListener {
            val i = Intent(this,MainActivity::class.java)
            startActivity(i)
        }

        val b2 = findViewById<AppCompatButton>(R.id.follow_button);
        b2.setOnClickListener {
            b2.setBackgroundColor(Color.BLACK)
            b2.text = " Following! "
        }

    }
}