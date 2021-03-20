package com.testing.class8;

import com.testing.class4.Dog;

public class OverLoading {
    public static void main(String[] args) {
        Dog dog=new Dog("拉拉");
        int intnum=3;
        float floatnum=(float)3;
        double doublenum=3;
        System.out.println(dog+",狗子长大intnum=3岁后年龄是"+(dog.grow(3)+dog.getAge()));
        System.out.println(dog+",狗子长大floatnum=25岁后年龄是"+(dog.grow((float) 25)+(float)dog.getAge()));
        System.out.println(dog+",狗子长大doublenum=50岁后年龄是"+(dog.grow((double) 50)+(double)dog.getAge()));
    }
}
