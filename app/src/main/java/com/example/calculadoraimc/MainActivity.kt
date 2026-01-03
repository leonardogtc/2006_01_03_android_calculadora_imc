package com.example.calculadoraimc

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.SeekBar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, 0)
            insets
        }

        val editWeight = findViewById<EditText>(R.id.edit_weight)
        val seekbarHeight = findViewById<SeekBar>(R.id.seekbar_height)
        val buttonCalculate = findViewById<Button>(R.id.button_calculate)
        val buttonClear = findViewById<Button>(R.id.button_clear)

        buttonClear.setOnClickListener {
            editWeight.text.clear()
            seekbarHeight.progress = 120
        }

        buttonCalculate.setOnClickListener {

        }









    }
}