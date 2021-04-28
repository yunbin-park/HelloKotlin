package com.androidapp.hellokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.lang.Exception

class BmiKotlinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_view_binding)

        val heightField = findViewById<EditText>(R.id.heightField)
        val weightField = findViewById<EditText>(R.id.wieghtField)
        val btnBmi = findViewById<Button>(R.id.btnBmi)
        val txtResult = findViewById<TextView>(R.id.txtResult)

        btnBmi.setOnClickListener {
//      val height = heightField.getText().toString().toDouble()
//      val wieght = weightField.getText().toString().toDouble()
            val sWeight = weightField.getText().toString().toDouble()
            val sHeight = weightField.getText().toString().toDouble()
            
            try {
                val bmi = sWeight.toDouble() / Math.pow(sHeight.toDouble() / 100.0, 2.0)
                txtResult.setText("Your BMI = " + bmi)
            } catch (e: Exception) {
            txtResult.setText("Input(s) missing")
            }
        }
    }
}