package com.test.calculator

import org.junit.Test
import org.junit.Assert.*

class CalculatorTest {


    internal var cal = Calculator()

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
    fun sanzero() {
        cal.pushThree()
        cal.pushZeo()
        assertEquals(
                "30", cal.display())
    }

    @Test
    fun sanzerozeroone() {
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
        cal.pushAdd()
        cal.pushOne()
        cal.pushEqu()
        assertEquals(
                "4", cal.display())
    }

    @Test
    fun sub() {
        cal.pushThree()
        cal.pushSub()
        cal.pushOne()
        cal.pushEqu()
        assertEquals(
                "2", cal.display())
    }

    @Test
    fun div() {
        cal.pushNine()
        cal.pushDiv()
        cal.pushThree()
        cal.pushEqu()
        assertEquals(
                "3", cal.display())
    }

    @Test
    fun mul() {
        cal.pushThree()
        cal.pushZeo()
        cal.pushZeo()
        cal.pushMul()
        cal.pushTwo()
        cal.pushEqu()
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
    fun dotcal() {
        cal.pushOne()
        cal.pushDot()
        cal.pushSeven()
        cal.pushAdd()
        cal.pushOne()
        cal.pushDot()
        cal.pushFive()
        cal.pushEqu()
        assertEquals(
                "3.2", cal.display())
    }

    @Test
    fun com() {
        cal.pushThree()
        cal.pushZeo()
        cal.pushZeo()
        cal.pushMul()
        cal.pushTwo()
        cal.pushEqu()
        assertEquals(
                "600", cal.display())
    }

    @Test
    fun com1() {
        cal.pushThree()
        cal.pushZeo()
        cal.pushZeo()
        cal.pushMul()
        cal.pushTwo()
        cal.pushAdd()
        cal.pushFive()
        assertEquals(
                "5", cal.display())
        cal.pushEqu()
        assertEquals(
                "605", cal.display())
    }

    @Test
    fun com2() {
        cal.pushThree()
        cal.pushZeo()
        cal.pushZeo()
        cal.pushMul()
        cal.pushTwo()
        cal.pushAdd()
        assertEquals(
                "600", cal.display())
        cal.pushFive()
        assertEquals(
                "5", cal.display())
    }


    @Test
    fun com3() {
        cal.pushThree()
        cal.pushZeo()
        cal.pushZeo()
        cal.pushMul()
        cal.pushAc()
        cal.pushTwo()
        cal.pushAdd()
        assertEquals(
                "2", cal.display())
        cal.pushEqu()
        assertEquals(
                "2", cal.display())
    }

    @Test
    fun com4() {
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
        cal.pushEqu()
        assertEquals(
                "0", cal.display())
    }

    @Test
    fun pushDotDotTest() {
        cal.pushDot()
        cal.pushDot()
        assertEquals(
                "0.", cal.display())
    }
}