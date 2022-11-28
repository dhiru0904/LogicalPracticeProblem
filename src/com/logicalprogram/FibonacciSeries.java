package com.logicalprogram;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int number, i1 = 0, i2 = 0, i3=1 ;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Any number :----");
        number = input.nextInt();
        System.out.println("fibonacci series:");
        for (int i = 1; i <= number; i++) {
            i1 = i2;
            i2 = i3;
            i3 = i1 + i2;
            System.out.println(i1 + " ");
        }
    }
}
