package com.testing.class10.trafficToos;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

/**
 * @Classname Bicycle
 * @Description 自行车类
 * @Date 2021/2/26 13:23
 * @Created by 小白sy
 */
public class Bicycle implements TrafficTools{
    //接口的实现
    public void wheel(){
        System.out.println("自行车有两个轮子");
    }
    //接口的扩展
    public void voice(){
        System.out.println("自行车的喇叭-叮叮");
    }

    //私有变量
   private String ling="自行车铃";
}
