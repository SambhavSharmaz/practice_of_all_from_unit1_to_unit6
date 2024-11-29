package com.example.practice1st

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity15 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main15)

        val sendDataButton: Button = findViewById(R.id.sendDataButton)

        sendDataButton.setOnClickListener {
            val intent = Intent(this, MainActivity15_1::class.java)
            intent.putExtra("message", "Hello from First Activity")
            startActivity(intent)
        }
    }
}
