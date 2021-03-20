package com.testing.class10.interfaceTest;

public interface Employees {
    //定义接口中的变量时，因为变量都是常量，可以省去修饰符
    public static final String KIND="打工人";

    //接口中只允许有抽象方法，可以省略public abstract等修饰符，只写方法的名字
    public abstract String work();
    public String moyu();
    public void moyu(String methods);

    //接口中的抽象方法可以有默认的实现，加上default修饰符后，可以编写方法体
    //表示实现接口的类，默认有这个方法的实现方式
    default void drink(){
        System.out.println("打工人需要喝水");
    }
}
