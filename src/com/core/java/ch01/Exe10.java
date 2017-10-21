package com.core.java.ch01;

import java.util.Random;

/**
 * Created by david.wei on 21/10/2017.
 */
public class Exe10 {
    public static void main(String[] args) {
        System.out.println(" base 36 str: " + generateRandomString());
    }

    private static String generateRandomString() {
        Random random = new Random();
        long digit = random.nextLong();
        long quotient = 0;
        int remainder = 0;
        String[] alphabets = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
                "a", "b", "c", "d", "e", "f", "g", "h",
                "i", "j", "k", "l", "m", "n", "o", "p",
                "q", "r", "s", "t", "u", "v", "w", "x",
                "y", "z"};

        String result = "";

        System.out.print("Random long: " + digit);

        do {
            quotient = Math.floorDiv(digit, 36);
            remainder = (int)Math.floorMod(digit, 36);
            result = alphabets[remainder] + result;
            digit = quotient;
        } while(quotient > 0);

        return result;
    }
}
