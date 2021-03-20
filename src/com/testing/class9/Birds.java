package com.testing.class9;

public class Birds extends Animal {
    //子类中和父类有相同的变量时，调用时实际会取父类变量的值，所以这里的kind是灰色的
    public String kind="鸟类";

    public void eat() {
        System.out.println("鸟儿吃虫子");
    }
    public void fly(){
        System.out.println("鸟能够飞");
    }

}
