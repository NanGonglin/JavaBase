package com.testing.class3;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class ForTest {
    public static void main(String[] args) {
//        for(int i=1;i<=100;i++){
//            System.out.println(i);
//
//        }

        int i=1;
        for(;;){
            if(i<=100){
                System.out.println(i);
                i++;
            }
            else
                break;
        }
        System.out.println("最终i的值："+i);
    }




}
