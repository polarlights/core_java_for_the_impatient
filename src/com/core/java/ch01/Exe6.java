package com.core.java.ch01;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by david.wei on 21/10/2017.
 */
public class Exe6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please input a integer that you want to compute its factorial: ");

        int num = input.nextInt();
        BigInteger product = factorial(BigInteger.valueOf(num));

        System.out.printf("The result is: %d. ", product);
    }

    private static BigInteger factorial(BigInteger num) {
        if (num.compareTo(BigInteger.ONE) < 1) {
            return BigInteger.ONE;
         } else {
            return num.multiply(factorial(num.add(BigInteger.ONE.negate())));
        }
    }
}
