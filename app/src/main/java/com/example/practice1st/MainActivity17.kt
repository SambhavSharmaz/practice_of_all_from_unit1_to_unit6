package com.example.practice1st

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity17 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main17)

        val shareTextButton: Button = findViewById(R.id.shareTextButton)

        shareTextButton.setOnClickListener {
            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.type = "text/plain"
            shareIntent.putExtra(Intent.EXTRA_TEXT, "Check out this awesome app!")
            val chooser = Intent.createChooser(shareIntent, "Share via")
            startActivity(chooser)
        }
    }
}
