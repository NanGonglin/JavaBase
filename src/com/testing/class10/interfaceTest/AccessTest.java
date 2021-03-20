package com.testing.class10.interfaceTest;

public class AccessTest {
    public static void main(String[] args) {
        Tester roy=new Tester();

        //私有变量不能被直接调用和使用
//        System.out.println(roy.nickname);
//        nickname="肉";

        System.out.println(roy.getNickname());
        //同一个包中，可以使用default的方法
        roy.warm();
        roy.pocketMoney();

        TestSon son=new TestSon();
//        子类无法继承父类的private方法
//        son.ownMoney();
        son.warm();
        son.pocketMoney();
    }
}
