package com.example.practice1st

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity21 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main21)

        val showAlertButton: Button = findViewById(R.id.showAlertButton)

        showAlertButton.setOnClickListener {
            val alertDialog = AlertDialog.Builder(this)
                .setTitle("Alert")
                .setMessage("This is a custom alert dialog")
                .setPositiveButton("OK") { dialog, which ->
                    Toast.makeText(this, "OK clicked", Toast.LENGTH_SHORT).show()
                }
                .setNegativeButton("Cancel") { dialog, which ->
                    Toast.makeText(this, "Cancel clicked", Toast.LENGTH_SHORT).show()
                }
                .create()

            alertDialog.show()
        }
    }
}
