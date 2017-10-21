package com.core.java.ch01;

/**
 * Created by david.wei on 21/10/2017.
 */
public class Exe9 {
    public static void main(String[] args) {
        String str_1 = "Hello World";
        String str_2 = new String("Hello World");

        System.out.printf("equals: %b \t", str_1.equals(str_2));
        System.out.printf("==: %b", str_1 == str_2);
    }
}
