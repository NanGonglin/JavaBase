package com.testing.class10;

/**
 * @Classname MutiHomework
 * @Description 实现继承的多态性
 * @Date 2021/2/26 13:07
 * @Created by 小白sy
 */
public class MutiHomework {
    public static void main(String[] args) {
        AnimalsHomework people=new HumanHomework();
        AnimalsHomework Dog=new DogHomework();

        people.eat();
        people.sport();

        Dog.eat();
        Dog.sport();
    }
}
