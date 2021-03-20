package com.testing.class2;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        System.out.println("请输入任意一个年份");

        Scanner year= new Scanner(System.in);
        int oneyear=year.nextInt();

        if(oneyear <= 0)
            System.out.println("请输入合法的年份");
        else if(oneyear%4 ==0 )
            System.out.println(oneyear+"是闰年");
        else
            System.out.println(oneyear+"不是闰年");

    }
}
