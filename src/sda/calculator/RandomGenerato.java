package sda.calculator;

import java.util.Random;

public class RandomGenerato {
    private Random random;

    public RandomGenerato() {
        this.random = new Random();

    }

    public int getSmallNumber() {
        return random.nextInt(15);
    }

    public int getBigNumber() {
        return random.nextInt(1000) +1000;
    }

}
