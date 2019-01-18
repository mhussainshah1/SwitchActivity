package com.company;

import java.util.Scanner;

//0 1 2 3 5 8 13
public class FibonacciSequence {
    public static void main(String[] args) {
        int a = 0,b = 1 , c;
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        for (int i = 0; i < n ; i++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;

        }
    }
}
