package com.example.memes

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MemeActivity5 : AppCompatActivity() {
    lateinit var button9: TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme3)
        button9= findViewById(R.id.button9)
        button9.setOnClickListener {
            val intent = Intent(this, MemeActivity2::class.java)
            startActivity(intent)
        }
        }
    }

