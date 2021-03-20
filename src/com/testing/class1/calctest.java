package com.testing.class1;

public class calctest {
    public static void main(String[] args){
        byte a=3;
        short b=6;
        int c=8;
        long d=10;

        long result1=a+b/c+d;
        long result2=(a+b)%c+5-d;
        long result3=a+b%c*d;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }
}
