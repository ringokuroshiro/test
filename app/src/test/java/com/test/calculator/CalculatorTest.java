package com.test.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {


    Calculator cal = new Calculator();

    @Test
    public void zero() {
        cal.pushZeo();
        assertEquals(
                "0", cal.display());

    }

    @Test
    public void one() {
        cal.pushOne();
        assertEquals(
                "1", cal.display());

    }

    @Test
    public void tow() {
        cal.pushTwo();
        assertEquals(
                "2", cal.display());

    }

    @Test
    public void three() {
        cal.pushThree();
        assertEquals(
                "3", cal.display());

    }

    @Test
    public void four() {
        cal.pushFour();
        assertEquals(
                "4", cal.display());

    }

    @Test
    public void five() {
        cal.pushFive();
        assertEquals(
                "5", cal.display());

    }

    @Test
    public void six() {
        cal.pushSix();
        assertEquals(
                "6", cal.display());

    }

    @Test
    public void seven() {
        cal.pushSeven();
        assertEquals(
                "7", cal.display());

    }

    @Test
    public void eight() {
        cal.pushEight();
        assertEquals(
                "8", cal.display());

    }

    @Test
    public void nine() {
        cal.pushNine();
        assertEquals(
                "9", cal.display());

    }

    @Test
    public void sanzero() {
        cal.pushThree();
        cal.pushZeo();
        assertEquals(
                "30", cal.display());
    }

    @Test
    public void sanzerozeroone() {
        cal.pushThree();
        cal.pushZeo();
        cal.pushZeo();
        cal.pushOne();
        assertEquals(
                "3001", cal.display());
    }

    @Test
    public void add() {
        cal.pushThree();
        cal.pushAdd();
        cal.pushOne();
        cal.pushEqu();
        assertEquals(
                "4", cal.display());
    }

    @Test
    public void sub() {
        cal.pushThree();
        cal.pushSub();
        cal.pushOne();
        cal.pushEqu();
        assertEquals(
                "2", cal.display());
    }

    @Test
    public void div() {
        cal.pushNine();
        cal.pushDiv();
        cal.pushThree();
        cal.pushEqu();
        assertEquals(
                "3", cal.display());
    }

    @Test
    public void mul() {
        cal.pushThree();
        cal.pushZeo();
        cal.pushZeo();
        cal.pushMul();
        cal.pushTwo();
        cal.pushEqu();
        assertEquals(
                "600", cal.display());
    }

    @Test
    public void clear() {
        cal.pushAc();
        assertEquals(
                "0", cal.display());
    }

    @Test
    public void dot() {
        cal.pushOne();
        cal.pushDot();
        assertEquals(
                "1.", cal.display());
    }

    @Test
    public void dot2() {
        cal.pushOne();
        cal.pushDot();
        cal.pushThree();
        assertEquals(
                "1.3", cal.display());
    }

    @Test
    public void dotcal() {
        cal.pushOne();
        cal.pushDot();
        cal.pushSeven();
        cal.pushAdd();
        cal.pushOne();
        cal.pushDot();
        cal.pushFive();
        cal.pushEqu();
        assertEquals(
                "3.2", cal.display());
    }

    @Test
    public void com() {
        cal.pushThree();
        cal.pushZeo();
        cal.pushZeo();
        cal.pushMul();
        cal.pushTwo();
        cal.pushEqu();
        assertEquals(
                "600", cal.display());

    }

    @Test
    public void com1() {
        cal.pushThree();
        cal.pushZeo();
        cal.pushZeo();
        cal.pushMul();
        cal.pushTwo();
        cal.pushAdd();
        cal.pushFive();
        assertEquals(
                "5", cal.display());
        cal.pushEqu();
        assertEquals(
                "605", cal.display());

    }

    @Test
    public void com2() {
        cal.pushThree();
        cal.pushZeo();
        cal.pushZeo();
        cal.pushMul();
        cal.pushTwo();
        cal.pushAdd();
        assertEquals(
                "600", cal.display());
        cal.pushFive();
        assertEquals(
                "5", cal.display());
    }


    @Test
    public void com3() {
        cal.pushThree();
        cal.pushZeo();
        cal.pushZeo();
        cal.pushMul();
        cal.pushAc();
        cal.pushTwo();
        cal.pushAdd();
        assertEquals(
                "2", cal.display());
        cal.pushEqu();
        assertEquals(
                "2", cal.display());
    }

    @Test
    public void com4() {
        cal.pushZeo();
        cal.pushZeo();
        cal.pushZeo();
        cal.pushThree();
        assertEquals(
                "3", cal.display());
    }

    @Test
    public void com5() {
        cal.pushDot();
        cal.pushDot();
        cal.pushDot();
        assertEquals(
                "0.", cal.display());
        cal.pushEqu();
        assertEquals(
                "0", cal.display());
    }

}