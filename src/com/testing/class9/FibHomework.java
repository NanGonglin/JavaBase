package com.testing.class9;

import java.util.Arrays;
import java.util.Scanner;

public class FibHomework {
    public static void main(String[] args) {
        //输入提示语
        System.out.println("请输入一个数，用于打印这个数的斐波那契数列和这个数的值");
        Scanner inputNum=new Scanner(System.in);
        int num= 0;
        try {
            num = inputNum.nextInt();
        } catch (Exception e) {
            System.out.println("输入的值非数字，请重新输入");
        }
        System.out.println("在"+num+"以内的斐波那契数列是"+fibPrint(num));
        System.out.println("斐波那契数列第"+num+"项的值是"+fibValue(num));
    }

    //1、使用数组，输出斐波那契数列前N项结果
    public static String fibPrint(int num){
        int[] a=new int[num];
        a[0]=1;
        a[1]=2;
        for(int i=2;i<num;i++){
            a[i]=a[i-1]+a[i-2];
        }
        return Arrays.toString(a);
    }

    //2、使用递归算法，计算斐波那契数列第n项的值
    public static int  fibValue(int num){
        int n=0;
        if(num==1){
           n=1;
        }
        else if(num==2){
            n=2;
        }
        else{
            n=fibValue(num-1)+fibValue(num-2);
        }
        return n;
    }
}
