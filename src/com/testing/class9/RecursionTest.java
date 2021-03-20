package com.testing.class9;

import java.util.Arrays;
import java.util.Scanner;

public class RecursionTest {
    public static void main(String[] args) {
        System.out.println("请输入一个数");
        Scanner num=new Scanner(System.in);
        int n=num.nextInt();
        System.out.println(n+"的阶乘结果是"+jiecheng(n));
        System.out.println("第"+n+"项的斐波那契数列的值是"+fib(n));
        System.out.println(n+"位斐波那契数列是"+fib(n,n));

    }
    //求n的阶乘5
    public static int jiecheng(int n){
        int result;
        if(n==1){
            result=1;
        }else{
            result=n*jiecheng(n-1);
        }
        return result;
    }
    //斐波那契数列，从第3个数开始，值等于前两个数相加之和，1,2,3,5,8,13...
    public static int fib(int num){
        int result=1;
        if(num==1){
            result=1;
        }
        else if(num==2){
            result=2;
        }
        else{
            result=fib(num-1)+fib(num-2);
        }
        return result;
    }
    //使用数组形式打印出斐波那契数列
    public static int fib(int n,int num){
        int[] a=new int[n];
        a[0]=1;
        a[1]=2;
        for(int i=2;i<a.length;i++) {
            a[i]=a[i-1]+a[i-2];
        }
        System.out.println(Arrays.toString(a));
        return a[num-1];
    }
}
