package com.example.hello_world_app

import android.R.layout
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewText = findViewById<TextView>(R.id.textView)
        val colorchange = findViewById<Button>(R.id.button)
        val background = findViewById<Button>(R.id.button2)
        val changeText = findViewById<Button>(R.id.button3)
        val textEdit = findViewById<EditText>(R.id.editTextTextPersonName2)
        val layout = findViewById<ConstraintLayout>(R.id.r1Var1)

        colorchange.setOnClickListener {
            Log.i("Onwell", "Tap on button")
            viewText.setTextColor(resources.getColor(R.color.purple_200))
        }
        background.setOnClickListener {
            layout.setBackgroundColor(resources.getColor(R.color.teal_200))
        }
        changeText.setOnClickListener {
            viewText.setText(textEdit.text)
        }

    }
}