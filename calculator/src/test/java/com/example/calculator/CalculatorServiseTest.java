package com.example.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiseTest {
    CalculatorServise calculatorServise = new CalculatorServise();

    @Test
    void testPlus() {
        assertEquals(3, calculatorServise.plus(1, 2));
        assertEquals(1, calculatorServise.plus(-1, 2));
        assertEquals(-1, calculatorServise.plus(1, -2));
        assertEquals(-3, calculatorServise.plus(-1, -2));
        assertEquals(1, calculatorServise.plus(1, 0));
        assertEquals(2, calculatorServise.plus(0, 2));
        assertEquals(0, calculatorServise.plus(0, 0));
        assertEquals(-30, calculatorServise.plus(-30, 0));
        assertEquals(-25, calculatorServise.plus(0, -25));

    }

    @Test
    void testMinus() {
        assertEquals(-1, calculatorServise.minus(1, 2));
        assertEquals(-3, calculatorServise.minus(-1, 2));
        assertEquals(3, calculatorServise.minus(1, -2));
        assertEquals(1, calculatorServise.minus(-1, -2));
        assertEquals(1, calculatorServise.minus(1, 0));
        assertEquals(-2, calculatorServise.minus(0, 2));
        assertEquals(0, calculatorServise.minus(0, 0));
        assertEquals(-30, calculatorServise.minus(-30, 0));
        assertEquals(25, calculatorServise.minus(0, -25));

    }

    @Test
    void testMultiply() {
        assertEquals(2, calculatorServise.multiply(1, 2));
        assertEquals(-2, calculatorServise.multiply(-1, 2));
        assertEquals(-2, calculatorServise.multiply(1, -2));
        assertEquals(2, calculatorServise.multiply(-1, -2));
        assertEquals(0, calculatorServise.multiply(1, 0));
        assertEquals(0, calculatorServise.multiply(0, 2));
        assertEquals(0, calculatorServise.multiply(0, 0));
        assertEquals(0, calculatorServise.multiply(-30, 0));
        assertEquals(0, calculatorServise.multiply(0, -25));

    }

    @Test
    void testDivide() {
        assertEquals(0, calculatorServise.divide(1, 2));
        assertEquals(0, calculatorServise.divide(0, 2));
        assertEquals(15, calculatorServise.divide(-30, -2));
        assertEquals(-1, calculatorServise.divide(10, -10));
        assertEquals(-2, calculatorServise.divide(-20, 10));

        assertThrows(IllegalArgumentException.class, () -> calculatorServise.divide(1, 0));
    }
}