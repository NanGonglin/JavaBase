package com.testing.class2;

public class selfplus {
    public static void main(String[] args){
        int x=1;
        int y=2;
        int z;

        z = z = x++ * 2 + ++x * 2 + y-- * 2 + --y * 2;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }
}
