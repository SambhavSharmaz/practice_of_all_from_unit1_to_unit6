package com.example.practice1st

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity11 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main11)

        val showSnackbarButton: Button = findViewById(R.id.showSnackbarButton)

        showSnackbarButton.setOnClickListener { view ->
            val snackbar = Snackbar.make(view, "Action completed", Snackbar.LENGTH_LONG)
            snackbar.setAction("Undo") {
                // Handle undo action here
                Snackbar.make(view, "Action undone", Snackbar.LENGTH_SHORT).show()
            }
            snackbar.show()
        }
    }
}
