package com.testing.class6;

public class TestMain {
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);

        String param1=args[0];
        String param2=args[1];

        //输入错误就不执行加法
        try {
            //try中的变量，也是局部变量
            int no1 = Integer.parseInt(param1);
            int no2 = Integer.parseInt(param2);
            System.out.println("加法的结果是"+(no1+no2));
        } catch (NumberFormatException e) {
           // e.printStackTrace();
            System.out.println("输入的参数不对，请重新输入");
        }
        //输入错误，按初始值执行加法
        int no1=0;
        int no2=0;
        try {
            no1=Integer.parseInt(param1);
            no2=Integer.parseInt(param2);
        } catch (NumberFormatException e) {
            //e.printStackTrace();
            System.out.println("输入的参数不对，请重新输入");
        }
        System.out.println("加法的结果是"+(no1+no2));

    }
}
