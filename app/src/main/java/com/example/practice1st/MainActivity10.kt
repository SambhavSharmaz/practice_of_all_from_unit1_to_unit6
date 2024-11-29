package com.example.practice1st

import android.content.res.Configuration
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity10 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main10)

        val greetingTextView: TextView = findViewById(R.id.greetingTextView)
        val switchLanguageButton: Button = findViewById(R.id.switchLanguageButton)

        switchLanguageButton.setOnClickListener {
            val currentLanguage = resources.configuration.locale.language
            val newLocale = if (currentLanguage == "en") Locale("fr") else Locale("en")
            Locale.setDefault(newLocale)

            val config = Configuration()
            config.locale = newLocale
            resources.updateConfiguration(config, resources.displayMetrics)

            // Recreate activity to reflect language change
            recreate()
        }
    }
}
