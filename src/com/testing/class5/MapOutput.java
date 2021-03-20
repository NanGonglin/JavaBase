package com.testing.class5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


public class MapOutput {
    public static void main(String[] args) {
        Map<String, Double> aMap = new HashMap<>();
        aMap.put("sy", 1.65);
        aMap.put("kwb", 1.78);
        aMap.put("mm", 1.62);
        aMap.put("dd", 1.65);
       

        //foreach方法遍历输出
        //1、使用键方式遍历
        System.out.println("1、使用键方式遍历");
        for (String m1 : aMap.keySet()) {
            System.out.println(m1);
        }
        //2、使用入口方式遍历
        System.out.println("2、使用入口方式遍历");
        for (Entry<String, Double> m2 : aMap.entrySet()) {
            System.out.println(m2);
        }

        System.out.println();

        //iterator方法遍历输出
        //1、使用入口方式遍历
        System.out.println("3、迭代器中使用入口方式遍历");
        Iterator<Entry<String, Double>> itS1 = aMap.entrySet().iterator();
        while (itS1.hasNext()) {
            System.out.println(itS1.next());
        }
        //2、使用键方式遍历
        System.out.println("4、迭代器中使用键方式遍历");
        Iterator<String> itS2 = aMap.keySet().iterator();
        while (itS2.hasNext()) {
            System.out.println(itS2.next());
        }





    }
}
