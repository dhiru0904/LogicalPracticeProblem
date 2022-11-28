package com.logicalprogram;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        int n;
        Scanner input=new Scanner(System.in);
        System.out.println("checked any number");
        n= input.nextInt();
    }
    public static void prime(int n){
        boolean b=false;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                b=true;
                break;
            }
        }
        if(!b)
            System.out.println(n+"prime number");
        else
            System.out.println(n+"not prime number");
    }
}
