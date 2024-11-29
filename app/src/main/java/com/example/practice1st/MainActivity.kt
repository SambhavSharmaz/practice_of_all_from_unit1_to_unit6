package com.example.practice1st

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView1: TextView = findViewById(R.id.textView1)
        val textView2: TextView = findViewById(R.id.textView2)
        val textView3: TextView = findViewById(R.id.textView3)
        val button: Button = findViewById(R.id.changeColorButton)

        button.setOnClickListener {
            textView1.setTextColor(Color.RED)
            textView2.setTextColor(Color.GREEN)
            textView3.setTextColor(Color.BLUE)
        }
    }
}
