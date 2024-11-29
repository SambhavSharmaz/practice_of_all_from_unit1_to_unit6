package com.example.practice1st

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        val hobby1: CheckBox = findViewById(R.id.hobby1)
        val hobby2: CheckBox = findViewById(R.id.hobby2)
        val hobby3: CheckBox = findViewById(R.id.hobby3)
        val showHobbiesButton: Button = findViewById(R.id.showHobbiesButton)

        showHobbiesButton.setOnClickListener {
            val selectedHobbies = StringBuilder()
            if (hobby1.isChecked) selectedHobbies.append("Reading\n")
            if (hobby2.isChecked) selectedHobbies.append("Traveling\n")
            if (hobby3.isChecked) selectedHobbies.append("Gaming\n")

            if (selectedHobbies.isNotEmpty()) {
                Toast.makeText(this, "Selected Hobbies:\n$selectedHobbies", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "No Hobbies Selected", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

