package com.testing.class11;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @Classname CalcRunWith
 * @Description runWith，用一个类实现调用多个测试用例，一起执行
 * @Date 2021/2/26 16:50
 * @Created by 小白sy
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({com.testing.class11.CalcData.class,com.testing.class11.CalculatorTest.class})
public class CalcRunWith {
}
