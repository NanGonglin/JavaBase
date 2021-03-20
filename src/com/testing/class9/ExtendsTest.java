package com.testing.class9;

import java.util.ArrayList;
import java.util.List;

public class ExtendsTest {
    public static void main(String[] args) {
        List a=new ArrayList();
        //
        Animal animal=new Animal();
        System.out.println(animal.getClass().getName());
        System.out.println(animal.toString());


        Mammals ma=new Mammals();
        //子类继承父类，可以使用父类中的变量和方法
        ma.eat();
        System.out.println(ma.hair);
        //子类可以调用扩展自己的方法
        ma.birth();

        Birds bird=new Birds();
        bird.eat();
        bird.sleep();

        //人类是manmals的子类，继承父类manmals方法和属性，也会继承manmals的父类animal的方法和属性
//        Human people=new Human();
//        people.useTools();
//        //当自己的类和父类的类名一致时，使用自己
//        people.eat();
//        people.sleep();
//        System.out.println(people.hair);
//        System.out.println(people.age);
//        System.out.println(people.toString());
//        people.birth();
//        people.birth("亚当");

        //构造方法使用
//        animal.Animal();

    }
}
