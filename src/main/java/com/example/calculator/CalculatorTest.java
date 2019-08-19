package com.example.calculator;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculatorTest {
    @Test
    public void test_양수덧셈(){
        Calculator calc = new Calculator();
        int result = calc.add(5,4);
        System.out.println("result = " + result);

        assertEquals("add 함수의 결과는 9여야 합니다.", 9, result);
    }

    @Test
    public void test_음수덧셈() {
        Calculator calc = new Calculator();
        int result = calc.add(-5,-4);
        System.out.println("result = " + result);

        assertEquals("add 함수의 결과는 9여야 합니다.", -9, result);
    }

    @Test
    public void test_양수덧셈2() {
        Calculator calc = new Calculator();
        int result = calc.add(5,4);

        assertNotEquals("add 함수의 결과는 9여야 합니다.", 9, result);
    }

    @Test
    public void test_정수나눗셈() {
        Calculator calc = new Calculator();
        int result = calc.divide(10,5);
        assertEquals(2, result);
    }

    @Test
    public void test_실수나눗셈() {
        Calculator calc = new Calculator();
        double result = calc.divide(10.0,4.0);
        assertEquals(2.5, result);
    }

    @Test
    public void test_0으로나누기() {
        Calculator calc = new Calculator();
        double result = calc.divide(10,0);
        assertEquals(0, result);
    }

    @Test
    public void test_곱하기() {
        Calculator calc = new Calculator();
        double result = calc.multiply(10,4);
        assertEquals("두 곱셈의 값은 40이어야 합니다.", 40, result);
        double result2 = calc.multiply(10,5);
        assertEquals("두 곱셈의 값은 50이어야 합니다.", 50, result);
    }
}

