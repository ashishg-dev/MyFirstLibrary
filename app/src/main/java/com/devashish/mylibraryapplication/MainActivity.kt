package com.devashish.mylibraryapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.devashish.myfirstlibrary.Calculate

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonAdd = findViewById<Button>(R.id.buttonAdd)
        val buttonSub = findViewById<Button>(R.id.buttonSub)
        val buttonMul = findViewById<Button>(R.id.buttonMul)
        val buttonDiv = findViewById<Button>(R.id.buttonDiv)
        val textResult = findViewById<TextView>(R.id.textViewResult)
        val number1 = findViewById<EditText>(R.id.number1)
        val number2 = findViewById<EditText>(R.id.number2)

        buttonAdd.setOnClickListener {
            textResult.text = Calculate.add(
                number1.text.toString().toInt(),
                number2.text.toString().toInt()
            ).toString()
        }

        buttonSub.setOnClickListener {
            textResult.text = Calculate.subtract(
                number1.text.toString().toInt(),
                number2.text.toString().toInt()
            ).toString()
        }

        buttonMul.setOnClickListener {
            textResult.text = Calculate.multiply(
                number1.text.toString().toInt(),
                number2.text.toString().toInt()
            ).toString()
        }

        buttonDiv.setOnClickListener {
            textResult.text = Calculate.divide(
                number1.text.toString().toInt(),
                number2.text.toString().toInt()
            ).toString()
        }

    }
}
