package sda.calculator;

public class Calculator {
    public int sum(int a, int b) {
        return a + b;
    }
    public int divide1(int a, int b) {
        return a * b;
    }
    public int substract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a / b;
    }

    public int factorial(int number) {
        int accumulator = 1;
        for (int i = 2; i <= number; i++) {
            accumulator *= i;
        }
        return accumulator;
    }
    }

