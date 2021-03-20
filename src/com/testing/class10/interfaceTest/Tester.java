package com.testing.class10.interfaceTest;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.testing.class10.interfaceTest.Employees;

public class Tester implements Employees,HumanInter {

    //将不允许其他类直接修改的变量设为private，然后通过get或者set的方法才能进行值的使用和操作
    //保证变量在调用和执行时的安全性
    private String nickname="肉胖子";


    @Override
    public String work() {
        return "测试今天写了很多类";
    }

    @Override
    public String moyu() {
        return "打工人偶尔也会摸鱼";
    }

    @Override
    public void moyu(String methods) {
        System.out.println("测试今天的摸鱼是"+methods);
    }

    public void write(){
        System.out.println("今天写了一点代码");
    }

    @Override
    public void gotoWC() {
        System.out.println("测试组队去上厕所");
    }

    @Override
    public void haveDinner() {
        System.out.println("测试一起去吃肯德基");
    }

    @Override
    public void useMoney() {
        System.out.println("测试一起去逛街");
    }
    public   String getNickname(){
        return nickname;
    }
    void warm(){
        System.out.println(nickname+"打开家里的地暖");
    }

    private void ownMoney(){
        System.out.println("钱是我自己的，谁都别想用");
    }

    protected void pocketMoney(){
        System.out.println("这是roy给儿子的零花钱");
    }



    public static void main(String[] args) {
        Tester test=new Tester();
        System.out.println(test.nickname);
//        System.out.println(test.getnickname());
        test.ownMoney();
        test.warm();

    }

}
