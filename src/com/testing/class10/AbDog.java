package com.testing.class10;
//abstract关键字，表示这是一个抽象类

public abstract class AbDog {
    public String name="狗子";

    public String bark(){
        System.out.println("狗子在汪汪叫");
        return "汪汪";
    }
    //抽象类可以有抽象方法,但是里面的抽象方法不能有方法体
    public abstract String playball();


}
