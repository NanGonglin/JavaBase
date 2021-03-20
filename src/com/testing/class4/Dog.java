package com.testing.class4;

public class Dog {
    //定义变量狗的年龄
    int intAge;
    float floatAge;
    double doubleAge;
    //定义变量狗的名字
    String name;
    //定义静态变量，狗的叫声
    static final String LITTLE_DOG = "呜呜";
    static final String BIG_DOG = "汪汪";
    static final String OLD_DOG = "嗷嗷";

    //构造方法
    public Dog(String name) {
        this.name = name;
    }

    //狗子长大的方法,参数是Int类型
    public  int grow(int growAge) {
        intAge = growAge;
//        bark();
        return intAge;
    }
    //狗子长大的方法,参数是float类型
    public float grow(float initAge) {
        floatAge = initAge;
        return floatAge;

    }
    //狗子长大的方法,参数是double类型
    public double grow(double initAge) {
         doubleAge= initAge;
         return doubleAge;
    }

    public void bark() {
        if (intAge >= 0 && intAge <= 10) {
            System.out.println("小" + name + "正在" + LITTLE_DOG);
        } else if (intAge < 50) {
            System.out.println("大" + name + "正在" + BIG_DOG);
        } else {
            System.out.println("老" + name + "正在" + OLD_DOG);
        }
    }

    public void setAge(int age) {
        this.intAge = age;
    }
    public int getAge() {
        return intAge;
    }
    public String toString() {
        return "这是一条名字是" + name + "的狗";
    }

    public static void main(String[] args) {
        Dog beibei = new Dog("贝贝");
        beibei.grow(3);
        beibei.grow((float)20.434);
        beibei.grow(36.66);
        //输出类型@引用地址
//        System.out.println(beibei.toString());
    }
}
