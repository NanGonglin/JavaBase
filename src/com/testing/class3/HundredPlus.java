package com.testing.class3;

public class HundredPlus {
    public static void main(String[] args) {
        int plus=0;

        for(int i=1;i<=100;i++){
            if(i%2==0){
                plus += i;
            }
        }
        System.out.println(plus);

    }
}
