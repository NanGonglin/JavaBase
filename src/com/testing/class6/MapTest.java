package com.testing.class6;

import java.security.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapTest {
    public static void main(String[] args) {
        //实例化变量
        Map<String, Integer> ageMap = new HashMap<>();

        //增
        ageMap.put("sy",25);
        ageMap.put("kwb",25);
        ageMap.put("pp",24);
        ageMap.put("gg",32);

        //删
        //ageMap.remove("pp",24);
        ageMap.remove("pp");


        //改,用put可以修改，修改key的值
        ageMap.replace("sy",18);


        //查
        //获取键对应得值
        ageMap.get("kwb");
        System.out.println(ageMap);
        //由于Map是键值对的情况，不存在下标值，所以不能用普通的for循环
        // 用foreach增强型循环
        System.out.println("----foreach遍历entryset如下-------");
        //1、键值对方式，可以手动导入Map.Entry的类,遍历Map中的entryset集合
        for (Entry<String, Integer> pair : ageMap.entrySet()) {
            System.out.println(pair);
            System.out.println(pair.getKey() + "长大10岁后是" + (pair.getValue() + 10));
        }
        System.out.println("----遍历keyset如下-------");
        //2、用key去遍历Map中的keyset集合
        for (String s : ageMap.keySet()) {
            System.out.println(s);
            System.out.println(s+"长大10岁后是" + (ageMap.get(s) + 10));
        }
        System.out.println("----iterator迭代器遍历entryset如下-------");
        //3、iterator迭代器遍历
        Iterator<Entry<String, Integer>> entryIt = ageMap.entrySet().iterator();
        while(entryIt.hasNext()){
            //修正：一次判断，只一次next取值
            //Entry<String,Integer> entry=entryIt.next();
            //System.out.println(entry.getKey()+"长大10岁后是" +(entry.getValue()+10));
            //一次hasnext判断，取了next两次值，getkey和getvalue,所以当数据为奇数时会发生报错，没有这个元素
            try {
                System.out.println(entryIt.next().getKey()+"长大10岁后是" +entryIt.next().getValue());
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(".next的调用可能有问题");
            }
        }
        System.out.println("----iterator迭代器遍历keyset如下-------");
        Iterator<String> entIt = ageMap.keySet().iterator();
        while (entIt.hasNext()){
            String ent=entIt.next();
            System.out.println(ent+"长大10岁后是" +(ageMap.get(ent)+10));
        }

    }
}
