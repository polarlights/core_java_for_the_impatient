package com.core.java.ch01;

import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;

/**
 * Created by david.wei on 21/10/2017.
 */
public class Exe13 {
    public static void main(String[] args) {
        Random random = new Random();

        ArrayList<Integer> numbers = new ArrayList<>();
        for(int idx = 1; idx < 50; idx++) {
            numbers.add(idx);
        }

        int[] result = new int[6];

        for ( int counter = 0; counter < 6; counter++) {
            int random_idx = random.nextInt(numbers.size());
            result[counter] = numbers.get(random_idx);
            numbers.remove(random_idx);
        }
        Arrays.sort(result);

        System.out.println("The lottery number is: " + Arrays.toString(result));
    }
}
