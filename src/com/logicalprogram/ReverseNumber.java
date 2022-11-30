package com.logicalprogram;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
            int reverse = 0, reminder;
            Scanner input = new Scanner(System.in);/*create user input obj*/
            System.out.println("Enter the number: ");
            int number = input.nextInt();
            for (;number!=0;number=number/10)/*divided number of 10 for loop*/

            {
                reminder = number % 10;/*calculate the reminder of the number using modulo*/
                reverse = reverse * 10 + reminder;
            }
            System.out.println("The reverse no is: " + reverse);
        }
    }

