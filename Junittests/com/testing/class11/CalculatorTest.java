package com.testing.class11;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Classname CalculatorTest
 * @Description 测试数据和测试用例未分开
 * @Date 2021/2/26 14:46
 * @Created by 小白sy
 */
public class CalculatorTest {
    public Calculator cal=new Calculator();

    @Test
    public void add() {
        cal.add(null,3);
        cal.add(3,null);
        cal.add(-1, 3);
        cal.add(4, -2);
        cal.add(4, 55);

    }

    @Test
    public void sub() {
        cal.sub(null,23);
        cal.sub(54,null);
        cal.sub(-2,23);
        cal.sub(54,-8);
        cal.sub(11,23);
        cal.sub(54,23);
    }
}