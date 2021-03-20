package com.testing.class9;

public class Man extends Human {
    //将父类的final方法重写时，会发生报错
//    public final void useTools(){
//        System.out.println("男人擅长使用机械类工具");
//    }
    public Man(){
        //在自己的构造方法中调用父类的构造方法
        super();
    }
    //super调用父类的吃方法
    public void eat(){
        //调用父类的方法
        super.eat();
        //调用父类的变量
        System.out.println("男人"+super.name+"喜欢喝酒");
    }
}
