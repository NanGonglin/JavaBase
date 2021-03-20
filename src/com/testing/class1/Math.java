package com.testing.class1;

public class Math {
    public static void main(String[] args){
        byte ba = 3;
        short sa = 17;
        int ia = 7;
        long la = 6;

        float fa=1.3f;
        double da=1.3;

        //默认用int类型计算，所以结果是int类型，如果要转换成低精度需要强制转换
        short resultdevide = (short) (sa / ba);

        //运算结果以计算表达式的最高精度为准，表达式中有long,所以结果自动是long
        long resultM = ia * la;

        //求余数
        int resultyu = sa % ba;

        System.out.println("除法的结果是：" + resultdevide);
        System.out.println("乘法的结果是：" + resultM);
        System.out.println("余数的结果是：" + resultyu);


        //报错,因为是float类型，无法自动转换为int
        //int resulti = sa/fa;

        //由于java能自动低转高，所以这两个都不报错
        //short低精度转换为高精度float，所以结果是float类型
        float resultf =sa/fa;
        //short低精度转换为高精度double，所以结果是double类型
        double resultd = sa/da;

        System.out.println("sa/fa的结果是" + resultf);
        System.out.println("sa/da的结果是" + resultd);

        //整数计算，结果为整数，向下取整，结果是2
        int resulti = ia/ba;
        //先进行整数结果计算，结果是2，再转成float类型
        float resultfi =(float)(ia/ba);
        //先把ia转换成float类型,计算式的最高精度就变成了float，用float来进行计算
        float resultfi2 =(float)ia/ba;

        System.out.println(resulti);
        System.out.println(resultfi);
        System.out.println(resultfi2);
    }



}
