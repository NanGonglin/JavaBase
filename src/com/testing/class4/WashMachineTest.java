package com.testing.class4;

//调用WashMachine这个类，在同一个包中的类，这个语句不是必须的，如果在不同的包，那么是需要加的
import com.testing.class3.MultiTable;
import com.testing.class4.WashMachine;

public class WashMachineTest {
    //如果一个类需要运行，那么一定要有main方法
    public static void main(String[] args) {
        //实例化操作，通过实例化产生一个真正能够调用类中方法的对象axi
        WashMachine axi=new WashMachine();

        //使用对象来调用变量
        System.out.println(axi.brand);
        //静态变量，可以使用类名来调用
        System.out.println(WashMachine.brand);
        //使用对象来调用方法
        axi.ShowBrand();
        //静态方法，可以使用类名来调用
         WashMachine.ShowBrand();

        //调用洗衣服的方法，开始洗衣服
        axi.wash();
        //String final KIND;

        //String类的变量未赋值，默认值是null
        //容易出现空指针异常的情况
        //System.out.println(axi.cost.equals("cuowu"));
        //最好用常量.equals(定义的字符串变量)，避免出现空指针
        System.out.println("cuowu".equals(axi.cost));

        //int类的变量未赋值,默认值是0
        System.out.println("定价之前的价格："+axi.price);
        //调用对象可以使用axi这个类中的方法setPrice
        //设置洗衣机的价格
        axi.setPrice(3000);
        System.out.println("定价之后的价格："+axi.price);

        //用输入的钱数去购买洗衣机
        String buyResult = axi.BuyWashMachine(3000);
        //输出购买的结果
        System.out.println("购买的结果是:"+buyResult);

        //调用别的包中的类
        MultiTable.main(null);
    }
}
