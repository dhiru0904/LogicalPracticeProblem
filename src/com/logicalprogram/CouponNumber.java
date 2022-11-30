package com.logicalprogram;

public class CouponNumber {
    public static void main(String[] args){
        char[] chars="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
        int random=(int) (Math.random()*100000000);
        StringBuffer stringbuffer=new StringBuffer();
        while (random>0)
        {
            stringbuffer.append(chars[random % chars.length]);
            random = random / chars.length;
        }
        String couponCode=stringbuffer.toString();
        System.out.println("Coupon code : "+couponCode);
    }
}
