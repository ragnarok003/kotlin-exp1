package com.example.myapplication

import android.R.attr.button
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.ui.text.font.Typeface


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val chFontBtn =findViewById<Button>(R.id.chFontBtn)
        val chcolorBtn =findViewById<Button>(R.id.chColorBtn)

        val opText=findViewById<TextView>(R.id.opText)

        chcolorBtn.setOnClickListener {
            opText.setTextColor(R.color.black)
        }

        chFontBtn.setOnClickListener{
            opText.setTextAppearance(android.R.style.TextAppearance_DeviceDefault_Large)
        }

    }
}