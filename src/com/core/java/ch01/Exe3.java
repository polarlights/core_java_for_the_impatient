package com.core.java.ch01;

import java.util.Scanner;

/**
 * Created by david.wei on 21/10/2017.
 */
public class Exe3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please input 3 integers to compare: ");
        int first = input.nextInt();
        int second = input.nextInt();
        int third = input.nextInt();
        int max = first;

        if (max < second) {
           max = second;
        }

        if (max < third) {
            max = third;
        }

        int max_by_max = Math.max(first, second);
        max_by_max = Math.max(max_by_max, third);

        System.out.printf("[%d, %d, %d] the max one is: %d, by Math.max will be: %d.",
                first, second, third, max, max_by_max);
    }
}
