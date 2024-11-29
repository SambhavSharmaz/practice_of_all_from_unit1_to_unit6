package com.example.practice1st

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity13 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main13)

        val logButton: Button = findViewById(R.id.logButton)

        logButton.setOnClickListener {
            // Logging a user action
            Log.d("UserAction", "Button clicked")
        }
    }
}