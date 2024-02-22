package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var editText: EditText
    private lateinit var button: Button
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "Welcome!! we are happy to onboard you",Toast.LENGTH_LONG).show();
        editText = findViewById(R.id.ed1)
        button = findViewById(R.id.bt1)
        textView = findViewById(R.id.tv2)


        button.setOnClickListener {
            calculateAndDisplayTable()
        }
    }

    private fun calculateAndDisplayTable() {
        val inputNumberStr = editText.text.toString()

        if (inputNumberStr.isNotEmpty()) {
            val inputNumber = inputNumberStr.toInt()
            val tableResult = generateTable(inputNumber)
            textView.text = tableResult
        } else {
            textView.text = "Please enter a number."
        }
    }

    private fun generateTable(number: Int): String {
        val stringBuilder = StringBuilder()
        for (i in 1..10) {
            val result = number * i
            stringBuilder.append("$number x $i = $result\n")
        }
        return stringBuilder.toString()
    }
}
