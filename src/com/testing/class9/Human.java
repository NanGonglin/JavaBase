package com.testing.class9;

public class Human  {
    final  int age=10;
    String name="bb";
    public String kind="人类";
    public Human(){
//        super("海棠");
        System.out.println("人类宝宝出生了");
    }
    //构造方法不能被重写
//    public  Mammals(){
//        System.out.println();
//    }
    public final void useTools(){
        System.out.println("人类会使用工具");
    }
    public  void eat(){
        System.out.println("人类吃熟食");
    }
    //重写方法的条件：方法的返回类型一致，方法名一致，参数列表一致
//    public String birth(){
//        return "人类出生了";
//    }
    //返回类型相同的重写,参数列表相同
//    public void birth(){
//        super.birth();
//        System.out.println("作为哺乳动物的年龄是"+super.age);
//        System.out.println("人类自己的年龄是"+this.age);
//        System.out.println("人类生了个宝宝");
//    }
    //参数列表不同时，就是重载了
    public void birth(String name){
        System.out.println("人类生了个孩子叫"+name);
    }

    public String toString(){
        return "这是一个"+age+"岁的人类";
    }

}
