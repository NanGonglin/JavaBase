package com.testing.class10.interfaceTest;

public class EmployeesTest {
    public static void main(String[] args) {
        Employees tester=new Tester();

        //Tester在实现接口调用的时候，重现实现的work方法
        System.out.println(tester.work());

        //有default实现的默认方法
        tester.drink();
        //接口类的引用指向实现类的对象，也会隐藏实现类新扩展的方法
//        em.write();
        //只有将接口类型转换为实现它的类型后，才能重新使用实现类扩展的方法
        ((Tester) tester).write();

        System.out.println( tester.moyu());
        tester.moyu("浏览网站");

        //通过接口实现实例化
        Employees dev=new Developer();
        //通过实现类对象直接实例化
        Developer bb=new Developer();
        System.out.println(dev.work());
        System.out.println(bb.work());
        System.out.println(dev.moyu());
        System.out.println(bb.moyu());
        dev.moyu("看算法题");
        bb.moyu("看算法题");

        //调用的时候，通过接口类型进行调用，只需要关注实现类是对应得接口即可
        Boss money=new Boss();
        money.callexwork(tester);
        money.callexwork(dev);
        //bb是一个Developer对象，实现了employees接口，调用的时候，能够自动转换
        money.callexwork(bb);


        //接口对象，在进行方法调用的时候，不能使用其他接口的方法
//        tester.gotoWC();
        //需要转换为实现类对象，才能调用
        ((Tester) tester).gotoWC();
        //或者转换为其他接口的类型
        ((HumanInter) tester).gotoWC();
        System.out.println(((Tester) tester).getNickname());


    }
}
