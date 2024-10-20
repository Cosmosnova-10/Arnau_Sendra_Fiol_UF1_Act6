package com.example.uf1act6

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    private lateinit var textInput: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.editTextText)
        val button = findViewById<Button>(R.id.button)


        button.setOnClickListener {

            val text = editText.text.toString()
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
        }


    }




}