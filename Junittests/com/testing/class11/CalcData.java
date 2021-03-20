package com.testing.class11;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * @Classname CalcData
 * @Description 数据驱动测试
 * @Date 2021/2/26 14:46
 * @Created by 小白sy
 */
@RunWith(Parameterized.class)
public class CalcData {

    public static Calculator ls;
    static Integer a;
    static Integer b;

    @BeforeClass
    public static void newCala(){
        ls=new Calculator();
    }

    //构造方法完成对成员变量的赋值操作,构造方法中，定义和二维数据每一行的元素对应得参数列表
    public CalcData(Integer int1, Integer int2) {
        a = int1;
        b = int2;
    }

    @Test
    public void add() {
        ls.add(a, b);
    }

    @Test
    public void sub() {
        ls.sub(a, b);
    }


    @Parameterized.Parameters(name = "操作数是{0}和{1}时")
    //类必须是二维数组
    public static Object[][] calaData(){
        Object[][] data = new Object[][]{
                {null,3},
                {3,null},
                {-1, 3},
                {4, -2},
                {11,23},
                {4, 55},
        };
        return data;
    }
}
