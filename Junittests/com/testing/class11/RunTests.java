package com.testing.class11;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @Classname RunTests
 * @Description 类型说明
 * @Date 2021/2/26 10:37
 * @Created by 小白sy
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({com.testing.class11.LoginDataTest.class,com.testing.class11.LoginSampleTest.class})
public class RunTests {
}
