package com.logicalprogram;
import java.util.Scanner;
/*the Perfect Number is also a special type of
positive number. When the number is equal to the sum of its positive divisors
excluding the number, it is called a Perfect Number.*/
public class PerfectNumber {
    public static void main(String[] args) {
        int number, sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number:");
        number = input.nextInt();
        if (number > 0) { /* If number is greater than zero */
            for (int i = 1; i < number; i++) {
                if (number % i == 0) { /* sum of the factors */
                    sum = sum + i;
                }
            }
            if (sum == number) {/*sum equal to number*/
                System.out.println(number + " is a perfect number ");

            } else {
                System.out.println(number + " is not a perfect number ");
            }

        }
    }}
