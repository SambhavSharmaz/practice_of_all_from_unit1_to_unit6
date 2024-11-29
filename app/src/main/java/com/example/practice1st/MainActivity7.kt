package com.example.practice1st

import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)

        val genderRadioGroup: RadioGroup = findViewById(R.id.genderRadioGroup)
        val submitButton: Button = findViewById(R.id.submitButton)

        submitButton.setOnClickListener {
            val selectedId = genderRadioGroup.checkedRadioButtonId
            if (selectedId != -1) {
                val selectedRadioButton: RadioButton = findViewById(selectedId)
                val gender = selectedRadioButton.text.toString()
                Toast.makeText(this, "Selected Gender: $gender", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "No Gender Selected", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
