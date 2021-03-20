package com.testing.class5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        //Integer 是int 的包装类,最好在新增的时候就确定好泛型
        Set<Integer> iSet= new HashSet<>();
        //set是没有长度限制的,可以随时的进行增加和删除。
        //增
        iSet.add(123);
        iSet.add(123);
        iSet.add(456);

        //删
        //iSet.remove(123);

        //改,没有下标的概念，所以不存在改，同时set存储的顺序也是没有内容的

        //查
        System.out.println(iSet);

        //itertor迭代器
        Iterator<Integer> sit=iSet.iterator();
        //判断是否有下一个元素
        while (sit.hasNext()) {
            Integer num =  sit.next();
            System.out.println(num+2);
        }
        //for each 增强型循环
        for (Integer integer : iSet) {
            System.out.println(integer+1);
        }
    }
}
