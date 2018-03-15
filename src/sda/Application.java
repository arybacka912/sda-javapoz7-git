package sda;

import sda.calculator.Calculator;
import sda.calculator.RandomGenerato;

public class Application {
    public static void main(String[] args) {
        System.out.println("Hello word");
        Calculator calculator = new Calculator();
        RandomGenerato randomGenerato = new RandomGenerato();
        System.out.println(calculator.sum(randomGenerato.getSmallNumber(), randomGenerato.getBigNumber()));
        System.out.println(calculator.substract(randomGenerato.getSmallNumber(), randomGenerato.getBigNumber()));
        System.out.println(calculator.divide1(randomGenerato.getSmallNumber(), randomGenerato.getBigNumber()));
        System.out.println(calculator.multiply(randomGenerato.getSmallNumber(), randomGenerato.getBigNumber()));



    }
}
