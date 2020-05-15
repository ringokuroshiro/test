package com.test.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

import com.test.calculator.R

class MainActivity : AppCompatActivity() {
    private var textview: TextView? = null

    internal var cal = Calculator()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textview = findViewById(R.id.textView)

        val button0 = findViewById<View>(R.id.button0) as Button
        val button1 = findViewById<View>(R.id.button1) as Button
        val button2 = findViewById<View>(R.id.button2) as Button
        val button3 = findViewById<View>(R.id.button3) as Button
        val button4 = findViewById<View>(R.id.button4) as Button
        val button5 = findViewById<View>(R.id.button5) as Button
        val button6 = findViewById<View>(R.id.button6) as Button
        val button7 = findViewById<View>(R.id.button7) as Button
        val button8 = findViewById<View>(R.id.button8) as Button
        val button9 = findViewById<View>(R.id.button9) as Button

        val equ = findViewById<View>(R.id.equ) as Button
        val div = findViewById<View>(R.id.div) as Button
        val mul = findViewById<View>(R.id.mul) as Button
        val sub = findViewById<View>(R.id.sub) as Button
        val add = findViewById<View>(R.id.add) as Button
        val ac = findViewById<View>(R.id.ac) as Button
        val dot = findViewById<View>(R.id.dot) as Button

        button0.setOnClickListener {
            cal.pushZeo()
            textview!!.text = cal.display()
        }
        button1.setOnClickListener {
            cal.pushOne()
            textview!!.text = cal.display()
        }
        button2.setOnClickListener {
            cal.pushTwo()
            textview!!.text = cal.display()
        }
        button3.setOnClickListener {
            cal.pushThree()
            textview!!.text = cal.display()
        }
        button4.setOnClickListener {
            cal.pushFour()
            textview!!.text = cal.display()
        }
        button5.setOnClickListener {
            cal.pushFive()
            textview!!.text = cal.display()
        }
        button6.setOnClickListener {
            cal.pushSix()
            textview!!.text = cal.display()
        }
        button7.setOnClickListener {
            cal.pushSeven()
            textview!!.text = cal.display()
        }
        button8.setOnClickListener {
            cal.pushEight()
            textview!!.text = cal.display()
        }
        button9.setOnClickListener {
            cal.pushNine()
            textview!!.text = cal.display()
        }
        add.setOnClickListener { cal.pushAdd() }
        sub.setOnClickListener { cal.pushSub() }
        mul.setOnClickListener { cal.pushMul() }
        div.setOnClickListener { cal.pushDiv() }
        equ.setOnClickListener {
            cal.pushEqu()
            textview!!.text = cal.display()
        }
        ac.setOnClickListener {
            cal.pushAc()
            textview!!.text = cal.display()
        }
        ac.setOnClickListener {
            cal.pushAc()
            textview!!.text = cal.display()
        }
        dot.setOnClickListener {
            cal.pushDot()
            textview!!.text = cal.display()
        }
    }
}
