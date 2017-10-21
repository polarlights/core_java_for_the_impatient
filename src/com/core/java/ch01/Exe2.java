package com.core.java.ch01;

import java.util.Scanner;

/**
 * Created by david.wei on 21/10/2017.
 */
public class Exe2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please input a integer angle(which may be positive or negative: ");
        int integer = input.nextInt();

        // x % y = x - (x / y) * y; x / y will be the closest to zero integer.
        // floorMod(x, y) = x - (floorDiv(x, y) * y), floorDiv will be less than or equals to the quotient.
        System.out.printf("%d normalizes to a value between 0 and 359 degrees, by %%: %d, by mod:%d.",
                integer, (integer % 360 + 360) % 360, Math.floorMod(integer, 360));
    }
}
