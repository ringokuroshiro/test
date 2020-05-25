package com.test.calculator

import java.lang.Double
import kotlin.String

class Calculator {

    private var number = ""
    private var result = "0"
    private var ope = Operation.NONE

    private enum class Operation {
        ADDITION,
        SUBTRACTION,
        MULTIPLICATION,
        DIVISION,
        NONE
    }

    fun display(): String {
        return if (number.isEmpty()) result else number
    }

    fun pushAddition() {
        pushOperation(Operation.ADDITION)
    }

    fun pushSubtraction() {
        pushOperation(Operation.SUBTRACTION)
    }

    fun pushMultiplication() {
        pushOperation(Operation.MULTIPLICATION)
    }

    fun pushDivision() {
        pushOperation(Operation.DIVISION)
    }

    fun pushEqual() {
        if (number.isNotBlank()) {
            val resultDouble = Double.parseDouble(result)
            val numberDouble = Double.parseDouble(number)
            val n = when (ope) {
                Operation.ADDITION -> resultDouble + numberDouble
                Operation.SUBTRACTION -> resultDouble - numberDouble
                Operation.MULTIPLICATION -> resultDouble * numberDouble
                Operation.DIVISION -> resultDouble / numberDouble
                else -> numberDouble
            }

            result = if (n == n.toInt().toDouble()) {
                String.format("%d", n.toInt())
            } else {
                String.format("%s", n)
            }
        }

        number = ""
        ope = Operation.NONE
    }

    fun pushAc() {
        number = ""
        result = "0"
        ope = Operation.NONE
    }

    fun pushDot() {
        if (number != "") {
            if (!number.contains(".")) {
                number = "$number."
            }
        } else {
            number = "0."
        }
    }

    fun pushZeo() {
        if (number == "0" || number == "") {

        } else {
            number = number + "0"
        }
    }

    fun pushOne() {
        pushNumber(1)
    }

    fun pushTwo() {
        pushNumber(2)
    }

    fun pushThree() {
       pushNumber(3)
    }

    fun pushFour() {
        pushNumber(4)
    }

    fun pushFive() {
        pushNumber(5)
    }

    fun pushSix() {
        pushNumber(6)
    }

    fun pushSeven() {
        pushNumber(7)
    }

    fun pushEight() {
        pushNumber(8)
    }

    fun pushNine() {
        pushNumber(9)
    }

    private fun pushNumber(number: Int) {
        this.number += number.toString()
    }

    private fun pushOperation(ope: Operation) {
        pushEqual()
        this.ope = ope
    }
}
