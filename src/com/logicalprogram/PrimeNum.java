package com.logicalprogram;

import java.util.Scanner;

public class PrimeNum {
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
