package com.testing.class9;

public class ConstructorTest {
    public static void main(String[] args) {
        //构造方法的调用，会递归调用父类的构造方法。human调用mammal，再调用animals
//        Human sy=new Human();
//        sy.birth();
        Man b=new Man();
        b.eat();
    }
}
