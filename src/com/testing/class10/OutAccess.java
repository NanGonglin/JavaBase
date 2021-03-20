package com.testing.class10;

import com.testing.class10.interfaceTest.Tester;

public class OutAccess {
    Tester outroy=new Tester();
    //default(没有权限修饰符)的层级，没有办法在包以外被调用
//    outroy.warm();
}
