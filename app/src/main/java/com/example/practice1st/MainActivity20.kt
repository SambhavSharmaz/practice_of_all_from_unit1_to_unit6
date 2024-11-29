package com.example.practice1st

import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity20 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main20)

        val textView: TextView = findViewById(R.id.contextMenuTextView)
        registerForContextMenu(textView)
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: android.view.View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.context_menu, menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.copy -> Toast.makeText(this, "Copy selected", Toast.LENGTH_SHORT).show()
            R.id.paste -> Toast.makeText(this, "Paste selected", Toast.LENGTH_SHORT).show()
            R.id.delete -> Toast.makeText(this, "Delete selected", Toast.LENGTH_SHORT).show()
        }
        return super.onContextItemSelected(item)
    }
}
