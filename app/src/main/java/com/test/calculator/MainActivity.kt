package com.test.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var cal = Calculator()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button0.setOnClickListener {
            cal.pushZeo()
            updateText()
        }
        button1.setOnClickListener {
            cal.pushOne()
            updateText()
        }
        button2.setOnClickListener {
            cal.pushTwo()
            updateText()
        }
        button3.setOnClickListener {
            cal.pushThree()
            updateText()
        }
        button4.setOnClickListener {
            cal.pushFour()
            updateText()
        }
        button5.setOnClickListener {
            cal.pushFive()
            updateText()
        }
        button6.setOnClickListener {
            cal.pushSix()
            updateText()
        }
        button7.setOnClickListener {
            cal.pushSeven()
            updateText()
        }
        button8.setOnClickListener {
            cal.pushEight()
            updateText()
        }
        button9.setOnClickListener {
            cal.pushNine()
            updateText()
        }
        add.setOnClickListener { cal.pushAddition() }
        sub.setOnClickListener { cal.pushSubtraction() }
        mul.setOnClickListener { cal.pushMultiplication() }
        div.setOnClickListener { cal.pushDivision() }
        equ.setOnClickListener {
            cal.pushEqual()
            updateText()
        }
        ac.setOnClickListener {
            cal.pushAc()
            updateText()
        }
        ac.setOnClickListener {
            cal.pushAc()
            updateText()
        }
        dot.setOnClickListener {
            cal.pushDot()
            updateText()
        }
    }
    
    private fun updateText() {
        textView.text = cal.display()
    }
}
