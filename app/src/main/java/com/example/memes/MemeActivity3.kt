package com.example.memes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MemeActivity3 : AppCompatActivity() {
    lateinit var button5: TextView
    lateinit var button6: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme3)
        button5= findViewById(R.id.button5)
        button6 = findViewById(R.id.button6)
        button5.setOnClickListener {
            val intent = Intent(this, MemeActivity2::class.java)
            startActivity(intent)
        }
        button6.setOnClickListener {
            val intent = Intent(this, MemeActivity4::class.java)
            startActivity(intent)

        }
    }
}