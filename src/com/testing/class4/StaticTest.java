package com.testing.class4;

public class StaticTest {
    public static void main(String[] args) {
        WashMachine axi=new WashMachine();
        WashMachine wash =new WashMachine();


        System.out.println(axi.color);
        System.out.println(wash.color);
        System.out.println(axi.brand);
        System.out.println(wash.brand);

        axi.color="蓝色";
        axi.brand="美的";

        System.out.println("---------修改成员变量的值后----------");

        System.out.println(axi.color);
        System.out.println(wash.color);
        System.out.println(axi.brand);
        System.out.println(wash.brand);

    }
}
