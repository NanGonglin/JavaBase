package com.testing.class3;

import java.util.Scanner;

public class MonthsSeason {
    public static void main(String[] args) {

        System.out.println("请输入任意一个月份");

        Scanner InputMonth= new Scanner(System.in);
        int month=InputMonth.nextInt();

        switch (month){
            case 3:
            case 4:
            case 5:
                System.out.println(month+"月份属于春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(month+"月份属于夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(month+"月份属于秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println(month+"月份属于冬季");
            default:
                break;
        }
    }
}
