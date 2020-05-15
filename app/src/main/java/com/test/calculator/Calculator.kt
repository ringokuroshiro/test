package com.test.calculator

import java.lang.Double
import kotlin.String

class Calculator {

    private var number = ""
    private var result = "0"
    private var ope = ""

    fun display(): String {
        return if (number.isEmpty()) result else number
    }

    fun pushAdd() {
        pushEqu()
        ope = "+"
    }

    fun pushSub() {
        pushEqu()
        ope = "-"
    }

    fun pushMul() {
        pushEqu()
        ope = "*"
    }

    fun pushDiv() {
        pushEqu()
        ope = "/"
    }


    fun pushEqu() {
        var n = Double.parseDouble(result)
        if (number != "") {
            if (ope == "+") {
                n += Double.parseDouble(number)
            } else if (ope == "-") {
                n -= Double.parseDouble(number)
            } else if (ope == "*") {
                n *= Double.parseDouble(number)
            } else if (ope == "/") {
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
        ope = ""

    }

    fun pushAc() {
        number = ""
        result = "0"
        ope = ""
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
        number = number + "1"
    }

    fun pushTwo() {
        number = number + "2"
    }

    fun pushThree() {
        number = number + "3"
    }

    fun pushFour() {
        number = number + "4"
    }

    fun pushFive() {
        number = number + "5"
    }

    fun pushSix() {
        number = number + "6"
    }

    fun pushSeven() {
        number = number + "7"
    }

    fun pushEight() {
        number = number + "8"
    }

    fun pushNine() {
        number = number + "9"
    }
}
