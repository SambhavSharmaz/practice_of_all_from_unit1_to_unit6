package com.example.practice1st

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main8)

        val countrySpinner: Spinner = findViewById(R.id.countrySpinner)
        val showCountryButton: Button = findViewById(R.id.showCountryButton)

        // List of countries
        val countries = arrayOf("India", "USA", "UK", "Canada", "Australia")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, countries)
        countrySpinner.adapter = adapter

        showCountryButton.setOnClickListener {
            val selectedCountry = countrySpinner.selectedItem.toString()
            Toast.makeText(this, "Selected Country: $selectedCountry", Toast.LENGTH_SHORT).show()
        }
    }
}
