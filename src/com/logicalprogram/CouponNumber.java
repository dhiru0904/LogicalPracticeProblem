package com.logicalprogram;
public class CouponNumber {
    public static void main(String[] args){
        /*character like that coupon code generated*/
        char[] chars="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
        int random=(int) (Math.random()*100000000);
        /* object is created */
        StringBuffer stringbuffer=new StringBuffer();
        while (random>0)/*number greater than zero*/
        {
            stringbuffer.append(chars[random % chars.length]);/*random character or length check*/
            random = random / chars.length;
        }
        String couponCode=stringbuffer.toString();
        System.out.println("Coupon code : "+couponCode);
    }
}
