package com.test.calculator

import org.junit.Test
import org.junit.Assert.*

class CalculatorTest {

    private val cal = Calculator()

    @Test
    fun zero() {
        cal.pushZeo()
        assertEquals(
                "0", cal.display())
    }

    @Test
    fun one() {
        cal.pushOne()
        assertEquals(
                "1", cal.display())
    }

    @Test
    fun tow() {
        cal.pushTwo()
        assertEquals(
                "2", cal.display())
    }

    @Test
    fun three() {
        cal.pushThree()
        assertEquals(
                "3", cal.display())
    }

    @Test
    fun four() {
        cal.pushFour()
        assertEquals(
                "4", cal.display())
    }

    @Test
    fun five() {
        cal.pushFive()
        assertEquals(
                "5", cal.display())
    }

    @Test
    fun six() {
        cal.pushSix()
        assertEquals(
                "6", cal.display())
    }

    @Test
    fun seven() {
        cal.pushSeven()
        assertEquals(
                "7", cal.display())
    }

    @Test
    fun eight() {
        cal.pushEight()
        assertEquals(
                "8", cal.display())
    }

    @Test
    fun nine() {
        cal.pushNine()
        assertEquals(
                "9", cal.display())
    }

    @Test
    fun threeZero() {
        cal.pushThree()
        cal.pushZeo()
        assertEquals(
                "30", cal.display())
    }

    @Test
    fun sanZeroZeroOne() {
        cal.pushThree()
        cal.pushZeo()
        cal.pushZeo()
        cal.pushOne()
        assertEquals(
                "3001", cal.display())
    }

    @Test
    fun add() {
        cal.pushThree()
        cal.pushAddition()
        cal.pushOne()
        cal.pushEqual()
        assertEquals(
                "4", cal.display())
    }

    @Test
    fun subtraction() {
        cal.pushThree()
        cal.pushSubtraction()
        cal.pushOne()
        cal.pushEqual()
        assertEquals(
                "2", cal.display())
    }

    @Test
    fun division() {
        cal.pushNine()
        cal.pushDivision()
        cal.pushThree()
        cal.pushEqual()
        assertEquals(
                "3", cal.display())
    }

    @Test
    fun multiplication() {
        cal.pushThree()
        cal.pushZeo()
        cal.pushZeo()
        cal.pushMultiplication()
        cal.pushTwo()
        cal.pushEqual()
        assertEquals(
                "600", cal.display())
    }

    @Test
    fun clear() {
        cal.pushOne()
        cal.pushAc()
        assertEquals(
                "0", cal.display())
    }

    @Test
    fun dot() {
        cal.pushOne()
        cal.pushDot()
        assertEquals(
                "1.", cal.display())
    }

    @Test
    fun dot2() {
        cal.pushOne()
        cal.pushDot()
        cal.pushThree()
        assertEquals(
                "1.3", cal.display())
    }

    @Test
    fun dotCalculate() {
        cal.pushOne()
        cal.pushDot()
        cal.pushSeven()
        cal.pushAddition()
        cal.pushOne()
        cal.pushDot()
        cal.pushFive()
        cal.pushEqual()
        assertEquals(
                "3.2", cal.display())
    }

    @Test
    fun calculateTest1() {
        cal.pushThree()
        cal.pushZeo()
        cal.pushZeo()
        cal.pushMultiplication()
        cal.pushTwo()
        cal.pushEqual()
        assertEquals(
                "600", cal.display())
    }

    @Test
    fun calculateTest2() {
        cal.pushThree()
        cal.pushZeo()
        cal.pushZeo()
        cal.pushMultiplication()
        cal.pushTwo()
        cal.pushAddition()
        cal.pushFive()
        assertEquals(
                "5", cal.display())
        cal.pushEqual()
        assertEquals(
                "605", cal.display())
    }

    @Test
    fun calculateTest3() {
        cal.pushThree()
        cal.pushZeo()
        cal.pushZeo()
        cal.pushMultiplication()
        cal.pushTwo()
        cal.pushAddition()
        assertEquals(
                "600", cal.display())
        cal.pushFive()
        assertEquals(
                "5", cal.display())
    }

    @Test
    fun calculateTest4() {
        cal.pushThree()
        cal.pushZeo()
        cal.pushZeo()
        cal.pushMultiplication()
        cal.pushAc()
        cal.pushTwo()
        cal.pushAddition()
        assertEquals(
                "2", cal.display())
        cal.pushEqual()
        assertEquals(
                "2", cal.display())
    }

    @Test
    fun calculateTest5() {
        cal.pushZeo()
        cal.pushZeo()
        cal.pushZeo()
        cal.pushThree()
        assertEquals(
                "3", cal.display())
    }

    @Test
    fun pushDotEqualTest() {
        cal.pushDot()
        cal.pushDot()
        cal.pushDot()
        cal.pushEqual()
        assertEquals(
                "0", cal.display())
    }

    @Test
    fun pushDotDotTest() {
        cal.pushOne()
        cal.pushDot()
        cal.pushDot()
        assertEquals(
                "1.", cal.display())
    }
}