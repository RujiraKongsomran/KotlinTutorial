package com.rujirakongsomran.kotlintutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    fun sum2number(a: Int, b: Int): Int {
        return a + b
    }

    fun minus2number(a: Int, b: Int): Int {
        return a - b
    }

    fun multi2number(a: Int, b: Int): Int {
        return a * b
    }

    fun divided2number(a: Float, b: Float): Float {
        if (b != 0f)
            return a / b
        else
            return 0f;
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSum.setOnClickListener {
            Toast.makeText(
                this,
                "" + sum2number(etNum1.text.toString().toInt(), etNum2.text.toString().toInt()),
                Toast.LENGTH_SHORT
            ).show()
        }

        btnMinus.setOnClickListener {
            Toast.makeText(
                this,
                "" + minus2number(
                    etNum1.text.toString().toInt(),
                    etNum2.text.toString().toInt()
                ),
                Toast.LENGTH_SHORT
            ).show()
        }

        btnMulti.setOnClickListener {
            Toast.makeText(
                this,
                "" + multi2number(
                    etNum1.text.toString().toInt(),
                    etNum2.text.toString().toInt()
                ),
                Toast.LENGTH_SHORT
            ).show()
        }

        btnDivided.setOnClickListener {
            Toast.makeText(
                this,
                "" + divided2number(
                    etNum1.text.toString().toFloat(),
                    etNum2.text.toString().toFloat()
                ),
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}