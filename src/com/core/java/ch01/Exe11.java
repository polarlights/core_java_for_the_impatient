package com.core.java.ch01;

import java.util.Scanner;

/**
 * Created by david.wei on 21/10/2017.
 */
public class Exe11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please input a string that include non-ascii characters:");

        String strings[] = input.nextLine().split("");

        for (int idx = 0; idx < strings.length; idx++) {
            int codePointValue = strings[idx].codePointAt(0);
            if (codePointValue > 255) {
                System.out.printf("%s is not ascii and its unicode value is: %d.\n", strings[idx], codePointValue);
            }
        }
    }
}
