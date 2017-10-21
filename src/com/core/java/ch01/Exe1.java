package com.core.java.ch01;

import java.net.SocketPermission;
import java.util.Scanner;

/**
 * Created by david.wei on 21/10/2017.
 */
public class Exe1 {
   public static void main(String args[]) {
       Scanner input = new Scanner(System.in);

       System.out.print("Please input an integer:");
       int input_int = input.nextInt();

       System.out.printf("%d in binary: %s, in octal: %o, in hex: %x.",
               input_int, Integer.toBinaryString(input_int), input_int, input_int);
   }
}
