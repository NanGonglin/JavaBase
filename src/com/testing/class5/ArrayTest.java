package com.testing.class5;

import java.util.Arrays;
import com.testing.class4.Dog;

public class ArrayTest {
    public static void main(String[] args) {
        //数组的新增
        int[] arrI=new int[4];

        int[] arrIf={1,3,5};
        System.out.println(arrI);

        System.out.println(arrIf[0]+","+arrIf[1]);

        //数组的修改
        arrI[0]=2;
        arrI[1]=5;
        arrI[2]=3;
        arrI[3]=8;


        //数组的查找
        for(int i=0;i<arrI.length;i++){
            System.out.print(arrI[i]+"\t");
        }

        System.out.print("\n");
        for(int i=0;i<arrIf.length;i++){
            System.out.print(arrIf[i]+"\t");
        }

        //增强型for循环,遍历容器中所有值
        //遍历的是值，不是下标，会引发数组下标越界异常，不建议使用
//        for(int zhi:arrIf){
//            System.out.println(arrIf[zhi]);
//        }

        System.out.print("\n");
        System.out.println("输出排序后的数组arrI");
        //通过Arrays中的静态方法sort进行排序
        Arrays.sort(arrI);
        //调用toString方法，将arrI中的内容按字符串拼接后输出
        System.out.println(Arrays.toString(arrI));

        //数组的存储数据类型可以是字符串等任何类型
        Dog[] dogs= new Dog[2];
        dogs[0]=new Dog("乐乐");
        //一旦数组已经有指定的类型，那么就只能存这个类型的东西
        //dogs[1]=4;
        System.out.println(dogs[0]);
        System.out.println(dogs);
    }
}
