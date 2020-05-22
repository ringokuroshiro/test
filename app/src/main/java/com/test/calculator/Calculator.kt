package com.test.calculator

import java.lang.Double
import kotlin.String

class Calculator {

    private var number = ""
    private var result = "0"
    private var ope = Operation.NONE

    private enum class Operation {
        ADD,
        SUBTRACTION,
        MULTIPLICATION,
        DIVISION,
        NONE
    }

    fun display(): String {
        return if (number.isEmpty()) result else number
    }

    fun pushAdd() {
        pushOperation(Operation.ADD)
    }

    fun pushSub() {
        pushOperation(Operation.SUBTRACTION)
    }

    fun pushMul() {
        pushOperation(Operation.MULTIPLICATION)
    }

    fun pushDiv() {
        pushOperation(Operation.DIVISION)
    }

    fun pushEqu() {
        var n = Double.parseDouble(result)
        if (number != "") {
            if (ope == Operation.ADD) {
                n += Double.parseDouble(number)
            } else if (ope == Operation.SUBTRACTION) {
                n -= Double.parseDouble(number)
            } else if (ope == Operation.MULTIPLICATION) {
                n *= Double.parseDouble(number)
            } else if (ope == Operation.DIVISION) {
                n /= Double.parseDouble(number)
            } else {
                n = Double.parseDouble(number)
            }
        }

        if (n == n.toInt().toDouble()) {
            result = String.format("%d", n.toInt())
        } else {
            result = String.format("%s", n)
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
        if (number == "") {
            number = "0."
        } else if (number == "0.") {

        } else {
            number = "$number."
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
        pushEqu()
        this.ope = ope
    }
}
