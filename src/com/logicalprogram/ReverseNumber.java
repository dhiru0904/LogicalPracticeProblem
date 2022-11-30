package com.logicalprogram;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
            int reverse = 0, reminder;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the number: ");
            int number = input.nextInt();
            for (;number!=0;number=number/10)
            {
                reminder = number % 10;
                reverse = reverse * 10 + reminder;
            }
            System.out.println("The reverse no is: " + reverse);
        }
    }

