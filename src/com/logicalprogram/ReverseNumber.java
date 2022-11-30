package com.logicalprogram;
/*a. We need to calculate the remainder of the number using the modulo
 b. After that, we need to multiply the variable reverse by 10 and add the remainder into
 it.c. We then divide the number by 10 and repeat steps until the number becomes 0.*/
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

