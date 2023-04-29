package com.example.memes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MemeActivity2 : AppCompatActivity() {
    lateinit var button2: TextView
    lateinit var button3: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme2)
        button2 = findViewById(R.id.button2)
        button2.setOnClickListener {
            val intent = Intent(this, MemeActivity3::class.java)
            startActivity(intent)
        }
        button3 = findViewById(R.id.button3)
        button3.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }
    }
}
