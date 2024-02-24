package com.example.calculator;

import net.bytebuddy.asm.MemberSubstitution;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiseTest2 {
    CalculatorServise calculatorServise = new CalculatorServise();

    public static Stream<Arguments> aegs() {
        return Stream.of(
                Arguments.of(1, 2),
                Arguments.of(-1, 2),
                Arguments.of(1, -2),
                Arguments.of(-1, -2),
                Arguments.of(1, 0),
                Arguments.of(0, 2),
                Arguments.of(0, 0),
                Arguments.of(-30, 0),
                Arguments.of(0, -25),
                Arguments.of(1, 2));
    }

    @ParameterizedTest
    @MethodSource("aegs")
    void namePlus(Integer num1, Integer num2) {
        assertEquals(num1 + num2, calculatorServise.plus(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("aegs")
    void nameMinus(Integer num1, Integer num2) {
        assertEquals(num1 - num2, calculatorServise.minus(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("aegs")
    void nameMultiply(Integer num1, Integer num2) {
        assertEquals(num1 * num2, calculatorServise.multiply(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("aegs")
    void nameDivide(Integer num1, Integer num2) {
        if (num2 == 0) {
            assertThrows(IllegalArgumentException.class, () -> calculatorServise.divide(num1, num2));
            return;
        }
        assertEquals(num1 / num2, calculatorServise.divide(num1, num2));
    }
}