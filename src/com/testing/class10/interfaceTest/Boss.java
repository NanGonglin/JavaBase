package com.testing.class10.interfaceTest;

import com.testing.class10.interfaceTest.Employees;

public class Boss {
    public void callexwork(Employees Worker){
        System.out.println("老板喊人来加班");
        System.out.println(Worker.work());
    }
}
