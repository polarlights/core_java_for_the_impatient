package com.core.java.ch01;

import java.util.Scanner;

/**
 * Created by david.wei on 21/10/2017.
 */
public class Exe8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please input a string including spaces: ");
        String str = input.nextLine();

        String[] str_ary = str.split("\\s+");

        for(String _str : str_ary) {
            System.out.println(_str);
        }
    }
}
