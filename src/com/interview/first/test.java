package com.interview.first;

/**
 * @Classname test
 * @Description 类型说明
 * @Date 2021/3/9 20:33
 * @Created by 小白sy
 */
public class test {
    static int i = 0;
    public static void main(String[] args) {
        func(i);
        System.out.println(i++);

    }

    public static void func(int i)
    {
        System.out.println(i++);
    }

}
