package com.testing.class4;

public class People {
    String name;
    int age;
    boolean sex;
    //常量
    String KIND;
    //静态变量
    String skin;

    //声明无参构造方法
    public People(String name){
        this.name=name;
    }


    //构造函数，赋值姓名和年龄
    public People(String name,int age){
        this.name = name;
        this.age = age;
    }

    static void eat(String name){
        System.out.println(name+"该吃饭了");
    }

    public static void main(String[] args) {
        People yuan=new People("海棠");
        People.eat("海棠");
    }
}
