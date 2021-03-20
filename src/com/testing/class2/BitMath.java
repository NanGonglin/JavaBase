package com.testing.class2;

public class BitMath {
    public static void main(String[] args){
        int a=33;
        int b=77;
        int c=a^b;

        System.out.println("a和b异或的结果为："+(a^b));
        System.out.println("a和c异或的结果为："+(a^c));
        System.out.println("b和c异或的结果为："+(b^c));

        int x=a<<26;
        System.out.println(x);

    }
}
