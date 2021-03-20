package com.testing.class3;

public class PrimeNumber {
    public static void main(String[] args) {
        int i, j;
        //定义一个标志位，默认所有数都是质数
        boolean IsPrime=true;

        for (i = 2; i <= 100; i++) {
            IsPrime=true;

            //基础写法
            //for (j = 2; j < i; j++) {

            //第1次优化：
            //for (j = 2; j <= i/2; j++) {

            //第2次优化：
            for (j = 2; j <= Math.sqrt(i); j++) {
                if ( i%j ==0) {
                    //如果能被整除，那么这个数就不是质数，这里标记下不是质数
                    IsPrime=false;
                    break;
                }
            }
            //break会跳出最近的一个循环体，即跳到这里
            if(IsPrime) {
                System.out.print(i + "\t");
            }
        }
    }
}
