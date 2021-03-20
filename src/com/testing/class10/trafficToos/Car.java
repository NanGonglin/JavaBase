package com.testing.class10.trafficToos;

/**
 * @Classname Car
 * @Description 汽车类
 * @Date 2021/2/26 13:24
 * @Created by 小白sy
 */
public class Car implements TrafficTools {
    public void wheel(){
        System.out.println("汽车有四个轮子");
    }

    public static void main(String[] args) {
        TrafficTools wuyang=new Bicycle();
        TrafficTools Mercedes=new Car();

        //接口的多态
        wuyang.wheel();
        Mercedes.wheel();

        //接口的扩展使用
        ((Bicycle)wuyang).voice();

        //使用接口中的成员变量
        System.out.println(TrafficTools.KIND);

        //私有变量不能被调用
//        System.out.println(wuyang.ling);
    }
}
