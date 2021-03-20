package com.testing.class10;

public  class AbstractClassTest {
    public static void main(String[] args) {
        //抽象类不能直接实例化，需要通过一个类继承之后，实现抽象类才能完成实例化
        //即使没有需要实现的抽象方法
//        AbDog xiaobai=new AbDog();
        AbDog dog=new AbDog(){
            @Override
            public String playball() {

                return null;
            }
        };
        //向上转型，依然可以实现
        AbDog ted=new Teddy();
    }
}
