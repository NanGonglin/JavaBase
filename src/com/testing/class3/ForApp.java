package com.testing.class3;

public class ForApp {
    public static void main(String[] args) {
        //高斯运算，从1加到100

        int plus=1;
        //for循环里面的变量，是局部变量，不能用于循环之外
        for(int i=2;i<=100;i++){
            plus=plus+i;
        }
        System.out.println(plus);

    }
}
