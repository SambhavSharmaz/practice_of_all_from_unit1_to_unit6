package com.example.practice1st

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main9)

        val fruitListView: ListView = findViewById(R.id.fruitListView)

        // List of fruits
        val fruits = arrayOf("Apple", "Banana", "Cherry", "Date", "Grape", "Mango")
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, fruits)
        fruitListView.adapter = adapter

        fruitListView.setOnItemClickListener { _, _, position, _ ->
            val selectedFruit = fruits[position]
            Toast.makeText(this, "Selected Fruit: $selectedFruit", Toast.LENGTH_SHORT).show()
        }
    }
}
