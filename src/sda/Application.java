package sda;

import sda.calculator.Calculator;

public class Application {
    public static void main(String[] args) {
        System.out.println("Hello word");
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(5,10));
    }
}
