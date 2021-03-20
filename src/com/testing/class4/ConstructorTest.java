package com.testing.class4;

public class ConstructorTest {
    public static void main(String[] args) {
        WashMachine axi=new WashMachine("能耗一级",6000);
        System.out.println(axi.cost);
        System.out.println(axi.price);

        //常量的值无法修改
        //axi.KIND="西裤机";
        System.out.println(axi.KIND);
    }
}
