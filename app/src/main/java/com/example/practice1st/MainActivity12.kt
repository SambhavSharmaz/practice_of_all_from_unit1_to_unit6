package com.example.practice1st

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import java.util.Locale

class MainActivity12 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main12)

        val languageListView: ListView = findViewById(R.id.languageListView)

        // List of supported languages
        val languages = arrayOf("English", "French")
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, languages)
        languageListView.adapter = adapter

        languageListView.setOnItemClickListener { _, _, position, _ ->
            val language = if (position == 0) "en" else "fr"
            val locale = Locale(language)
            Locale.setDefault(locale)
            val config = resources.configuration
            config.setLocale(locale)
            resources.updateConfiguration(config, resources.displayMetrics)

            // Recreate activity to reflect language change
            recreate()
        }
    }
}
