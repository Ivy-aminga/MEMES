package com.example.memes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MemeActivity4 : AppCompatActivity() {
    lateinit var button4: TextView
    lateinit var button7: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme3)
        button7= findViewById(R.id.button5)
        button7.setOnClickListener {
            val intent = Intent(this, MemeActivity3::class.java)
            startActivity(intent)
        }
        button4 = findViewById(R.id.button6)
        button4.setOnClickListener {
            val intent = Intent(this, MemeActivity5::class.java)
            startActivity(intent)

        }
    }
}
