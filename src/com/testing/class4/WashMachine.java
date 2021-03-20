package com.testing.class4;

public class WashMachine {
    //创建类的变量
    //如果给创建的变量不给初始值，那么int类的初始值默认是0，string类的初始值默认是null
    int price;
    static String brand="海尔";
    String color="白色";
    String cost;
    static final String KIND="洗衣机";
    //类中，默认有一个无参的构造方法，是隐式声明的，无返回类型
    public WashMachine(){

    }
    //不要给构造方法加返回类型，这样这个方法会被认为是普通的方法，并且会提示这个方法名和类名同名，是不对的
//    public void  WashMachine(){
//
//    }
    public WashMachine(String cost,int price){
        this.cost=cost;
        this.price=price;

    }


    //方法的构成要素：1、方法返回类型，2、方法名，3、(形参列表)，4、方法体

    /**
     * 空方法,该方法含义是执行洗衣服动作
     */
    void wash(){

        System.out.println("洗衣机开始洗衣服了！");
        //死循环调用
        //wash();
        //空返回的方法体一般存在隐式语句return；
        return;
    }

    /**
     * 返回String类型的方法，该方法含义是展示品牌
     * @return
     */

    static String ShowBrand(){
        brand+="牌";
        //静态方法中调用非静态的变量会报错，不可以调用
        //cost="能耗3级";
        return brand;
    }
    //静态方法中调用静态变量
    static void dry(){
        System.out.println("洗衣机带有甩干功能");
        //静态方法中可以调用静态方法
        ShowBrand();
        //静态方法中不能调用非静态的方法
        //getPrice();
    }


    /**
     * 存在形参，该方法的含义为输入钱数，返回是否能购买洗衣机，
     * @param money 参数money用于传递钱数，来判断是否足够购买
     * @return
     */
    String BuyWashMachine(int money){
        //非静态方法中可以调用静态方法，
        dry();
        //非静态方法也可以调用非静态方法
        //wash();
        if(money>=price){
            System.out.println("品牌是"+brand);
            return "钱数够用，喜提洗衣机一台";
        }
        else{
            return "钱数不够，买不了洗衣机";
        }
    }

    /**
     * 操作类中的属性变量，常用的set方法做赋值操作
     * @param money 输入money，用于赋值给类中的变量price
     */
    public void setPrice(int money) {
        this.price = money;
    }

    public int getPrice() {
        return price;
    }
}
