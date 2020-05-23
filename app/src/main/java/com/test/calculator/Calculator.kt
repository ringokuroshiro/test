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
        if (number.isNotBlank()) {
            val n = when (ope) {
                Operation.ADD -> Double.parseDouble(result) + Double.parseDouble(number)
                Operation.SUBTRACTION -> Double.parseDouble(result) - Double.parseDouble(number)
                Operation.MULTIPLICATION -> Double.parseDouble(result) * Double.parseDouble(number)
                Operation.DIVISION -> Double.parseDouble(result) / Double.parseDouble(number)
                else -> Double.parseDouble(number)
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
