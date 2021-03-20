package com.testing.class10;

import com.testing.class10.interfaceTest.Tester;

public class TestOutSon extends Tester {
    //不在同一个包中，子类可以继承父类的protect方法
//    public void pocketMoney(){
//
//    }

    public static void main(String[] args) {
        TestOutSon outson= new TestOutSon();
        outson.pocketMoney();

        //在不同的包中，父类对象无法使用子类的方法
//        Tester roy=new Tester();
//        roy.pocketMoney();
    }

}
