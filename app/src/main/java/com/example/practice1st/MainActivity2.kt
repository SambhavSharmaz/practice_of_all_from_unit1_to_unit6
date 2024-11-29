package com.example.practice1st

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val centerTextView: TextView = findViewById(R.id.centerTextView)
        val buttonAbove: Button = findViewById(R.id.buttonAbove)
        val buttonBelow: Button = findViewById(R.id.buttonBelow)

        buttonAbove.setOnClickListener {
            centerTextView.text = "Above Button Clicked"
        }

        buttonBelow.setOnClickListener {
            centerTextView.text = "Below Button Clicked"
        }
    }
}
