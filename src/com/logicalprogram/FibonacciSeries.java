package com.logicalprogram;

import java.util.Scanner;
/*
Fibonacci series is a special type of series in which the next term is the sum of the
previous two terms. For example, if 0 and 1 are the two previous terms in a series, then
the next term will be 1(0+1).
 */
public class FibonacciSeries {
    public static void main(String[] args) {
        int number, i1 = 0, i2 = 0, i3=1 ;/*create integer*/
        Scanner input = new Scanner(System.in);/*create user input obj*/
        System.out.println("Enter Any number :----");
        number = input.nextInt();
        System.out.println("fibonacci series:");
        /*for loop create*/
        for (int i = 1; i <= number; i++) {
            i1 = i2;
            i2 = i3;
            i3 = i1 + i2;
            System.out.println(i1 + " ");/*print series*/
        }
    }
}
