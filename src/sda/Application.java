package sda;

import sda.calculator.Calculator;

public class Application {
    public static void main(String[] args) {
        System.out.println("Hello word");
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(5,10));
        System.out.println(calculator.substract(5,10));
        System.out.println(calculator.divide1(5,10));
        System.out.println(calculator.multiply(5,10));



    }
}
