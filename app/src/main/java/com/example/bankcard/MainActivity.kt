package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.lang.Math.sqrt

class NewActivity : AppCompatActivity() {

    private lateinit var inputA: EditText
    private lateinit var newBtn: Button
    private lateinit var result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        inputA = findViewById(R.id.editTextA)
        result = findViewById(R.id.textView)
        newBtn = findViewById(R.id.button)

        newBtn.setOnClickListener {
            val s = inputA.text.toString()

            val numbers = result.filter{it.isDigit()}

            var sum = 0

            for (i in numbers.indices.reversed()) {
                var digit = numbers[i].toString().toInt()

                if (digit % 2 == 0) {
                    digit *= 2

                    if (digit > 9) {
                        digit -= 9
                    }
                }

                sum += digit;
            }

            if (sum % 10 == 0) {
                result.text = "OK"
            } else {
                result.text = "Error"
            }
        }


        Log.d("RRR","onCreate()")

    }

    override fun onStart() {
        super.onStart()
        Log.d("RRR","onStart()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("RRR","onDestroy()")
    }

    override fun onPause() {
        super.onPause()
        Log.d("RRR","onPause()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("RRR","onRestart()")
    }

    override fun onStop() {
        super.onStop()
        Log.d("RRR","onStop()")
    }

    override fun onResume() {
        super.onResume()
        Log.d("RRR","onResume()")
    }
}
