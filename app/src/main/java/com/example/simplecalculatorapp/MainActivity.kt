package com.example.simplecalculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import kotlin.math.pow

class MainActivity : AppCompatActivity() {

    private lateinit var number1 : EditText
    private lateinit var number2 : EditText
    private lateinit var result : TextView
    private  var num1 : Double = 0.0
    private  var num2 : Double = 0.0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // init views
        number1 = findViewById(R.id.num1)
        number2 = findViewById(R.id.num2)
        result = findViewById(R.id.result)

        number1.setText(num1.toString())
        number2.setText(num2.toString())



    }
    fun doSum(view: View) {
        num1 = number1.text.toString().toDouble()
        num2 = number2.text.toString().toDouble()
        val num3 = num1 + num2
        result.setText(num3.toString())
    }

    fun doSub(view: View) {
        num1 = number1.text.toString().toDouble()
        num2 = number2.text.toString().toDouble()
        val num3 = num1 - num2
        result.setText(num3.toString())
    }
    fun doDiv(view: View) {
        num1 = number1.text.toString().toDouble()
        num2 = number2.text.toString().toDouble()
        val num3 = num1 / num2
        result.setText(num3.toString())
    }
    fun doMul(view: View) {
        num1 = number1.text.toString().toDouble()
        num2 = number2.text.toString().toDouble()
        val num3 = num1 * num2
        result.setText(num3.toString())
    }
    fun doMod(view: View) {
        num1 = number1.text.toString().toDouble()
        num2 = number2.text.toString().toDouble()
        val num3 = num1.mod(num2)
        result.setText(num3.toString())
    }
    fun doPow(view: View) {
        num1 = number1.text.toString().toDouble()
        num2 = number2.text.toString().toDouble()
        val num3 = num1.pow(num2)
        result.setText(num3.toString())
    }

}