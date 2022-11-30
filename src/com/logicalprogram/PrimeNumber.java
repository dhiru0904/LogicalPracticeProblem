package com.logicalprogram;
/*the Prime number is also a special type of number. When
the number is divided greater than 1 aeven prime numbernd divided by 1 or itself is referred to as the Prime
number. 0 and 1 are not counted as prime numbers.All the even numbers can be
divided by 2, so 2 is the only even prime minister.*/
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        int n;
        Scanner input=new Scanner(System.in);/*create user input obj*/
        System.out.println("checked any number:----");
        n= input.nextInt();
    }
    public static void prime(int n){/*create method*/
        boolean b=false;
        /*create for loop*/
        for(int i=2;i<=n/2;i++){
            if(n%i==0){/*of the factor*/
                b=true;
                break;
            }
        }
        if(!b)/*check true or false and print*/
            System.out.println(n+"prime number");
        else
            System.out.println(n+"not prime number");
    }
}
