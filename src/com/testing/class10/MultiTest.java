package com.testing.class10;

import com.testing.class9.Animal;
import com.testing.class9.Birds;
import com.testing.class9.Mammals;
import com.testing.class10.Feeder;

public class MultiTest {
    public static void main(String[] args) {
        //父类引用指向子类对象
        //向上转型
        Animal an=new Mammals();
        Animal bi=new Birds();
        //子类引用指向父类,是错误的，不是所有的动物都是鸟
//        Birds bird=new Animal();


        //同样都是动物方法，同是用eat方法，产生了不同的执行结果
        an.eat();
        bi.eat();

        //向上转型之后，子类会隐藏扩展的方法和变量，mammal的birth方法不可用
//        an.birth();
        //kind的值为父类中kind的值
        System.out.println(an.kind);
        //子类中的变量legs被隐藏，无法使用
//        System.out.println(an.legs);

        //只有被向上转型后的实例，才能进行向下转型
        Birds bird=(Birds) bi;
        //向下转型之后，才能使用子类本身的方法
//        bi.fly();
        bird.fly();
        //因为.操作符的优先级高，所以使用强制转换时需要提高优先级，先转换为birds再调用本身子类扩展的方法或者变量
        ((Birds)bi).fly();
        System.out.println(((Birds) bi).kind);
        //未向上转型，是不能向下转型的。
        Birds ma=(Birds)an;


        Feeder sy=new Feeder();
        sy.feed(an);
        sy.feed(bi);

    }
}
