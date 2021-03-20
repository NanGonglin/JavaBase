package com.testing.class11;

/**
 * @Classname Plus
 * @Description 两个正数数字相加减的方法
 * @Date 2021/2/26 14:39
 * @Created by 小白sy
 */
public class Calculator {

    static Integer result=0 ;
    static Integer int1;
    static Integer int2;

    static String split="\"";
    static String regex="\\d";

    //加法的方法
    public static void add(Integer a, Integer b) {
        if ( a!= null && b != null) {
            if (a>0&&b>0) {
                result=a+b;
                System.out.println(a+"+"+b+"="+result);
            } else {
                System.out.println("测试数据需要为大于等于0的数");
            }
        } else {
            System.out.println("测试数据含有空值");
        }
    }

    //减法的方法
    public static void sub(Integer a, Integer b) {
        if (a != null && b != null) {
            if (a > 0 && b > 0) {
                if (a >= b) {
                    result = a - b;
                    System.out.println(a + "-" + b + "=" + result);
                } else {
                    System.out.println("第一个数需要大于第二个数");
                }
            } else {
                System.out.println("测试数据需要为大于等于0的数");
            }
        } else {
            System.out.println("测试数据含有空值");
        }
    }
}
