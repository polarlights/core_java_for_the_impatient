package com.core.java.ch01;

import java.util.Random;

/**
 * Created by david.wei on 21/10/2017.
 */
public class Exe7 {
    public static void main(String[] args) {
        Random random = new Random();

        int first = random.nextInt(65535);
        int second = random.nextInt(65535);

        System.out.printf("%d and %d the sum: %d, difference: %d, product: %d, quotient: %d, reminder: %d",
                first, second, first + second, first - second, first * second,
                first / second, first % second);
    }
}
