package com.example.practice1st

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity15_1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main15_1)

        val message = intent.getStringExtra("message")
        val messageTextView: TextView = findViewById(R.id.messageTextView)
        messageTextView.text = message
    }
}
