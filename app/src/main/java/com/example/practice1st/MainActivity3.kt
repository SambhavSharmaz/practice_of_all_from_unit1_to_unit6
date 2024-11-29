package com.example.practice1st

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        for (i in 1..9) {
            val buttonId = resources.getIdentifier("button$i", "id", packageName)
            val button: Button = findViewById(buttonId)
            button.setOnClickListener {
                Toast.makeText(this, "Button $i clicked", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
