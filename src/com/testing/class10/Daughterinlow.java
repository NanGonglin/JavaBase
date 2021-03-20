package com.testing.class10;

import com.testing.class10.interfaceTest.Tester;

public class Daughterinlow {
    public static void main(String[] args) {
        Tester son=new Tester();
        //不在一个包内，也没有继承父类，不能引用protect方法
//        son.ownMoney();
//        son.pocketMoney();

        TestOutSon outSon =new TestOutSon();
        //不在同一个包内，也没有继承父类，无法使用子类的方法
//        outSon.pocketMoney();
    }


}
