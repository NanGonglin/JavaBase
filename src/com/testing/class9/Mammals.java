package com.testing.class9;

//修饰符 class 子类名 extends 父类名
public class Mammals extends Animal {
    public String legs="哺乳动物跑的慢";
    public Mammals(){
        //System.out.println("哺乳动物出生了");
    }
    public Mammals(String name){
        System.out.println("名字是"+name+"的哺乳动物出生了");
    }
    public void birth() {
        System.out.println("哺乳动物是胎生动物");
    }

    public void eat() {
        System.out.println("哺乳动物吃肉");
    }
    public static void sleep(){
        System.out.println("哺乳动物闭眼睡觉");
    }
}
