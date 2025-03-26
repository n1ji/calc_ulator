package com.github.n1ji.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator calculator;
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Test for simple addition")
    void testAdd() {
        assertEquals(4, calculator.add(1,2), "Simple addition");
        assertEquals(-2, calculator.add(-4, 2));
    }

    @Test
    void testSubtract() {
        assertEquals(6, calculator.add(4,2), "Simple subtraction");
        assertEquals(-2, calculator.add(-4, 2), "Subtract a negative number");
    }

    @Test
    void testDivide() {
        assertEquals(2, calculator.divide(6,3), "Simple division");
        assertEquals(12, calculator.divide(144, 12), "144/12");
    }

    @Test
    @DisplayName("Divide by zero should throw ArithmeticExpression")
    void testDivideByZero() {
        Exception e = assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0));
        assertEquals("Can't divide by zero", e.getMessage());
    }
}
