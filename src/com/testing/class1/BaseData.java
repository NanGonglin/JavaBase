package com.testing.class1;


public class BaseData {
    //main方法是程序运行的入口
    public static void main(String[] args){
//        //声明变量
//        byte ba;
//        //给变量赋值
//        ba = 127;
//        //java进行整数计算的时候，默认使用Int类型进行计算
//        System.out.println(ba + 1);
//        //强制转换
//        System.out.println((byte)(ba + 1));
//        //变量声明的同时赋值
//        byte bb=(byte)128;
//        byte bc=(byte)1345;
//        System.out.println(bb);
//        System.out.println(bc);


        //布尔类型
        boolean ba=true;
        boolean bb=false;

        //char类型
        char ca='r';
        char cb='王';
        char cc='\'';
        char cd='"';

        int resultca =(int)ca;
        int resultcb =(int)cb;

        int ii=29575;
        char ci=(char)ii;

        //System.out.println(resultca);
        System.out.println(resultcb);
        System.out.println(ci);
        System.out.println(cc);
        System.out.println(cd);

        //字符串
        //字符串是java中的一个类对象类型，不是基本的数据类型
        String sa="roy";
        String sb="\"";



    }
}
