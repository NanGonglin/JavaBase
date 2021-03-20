package com.testing.class5;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        //Arraylist查询最快，LinkedList插入数据最快，一般通常使用的都是Arraylist
        List<String> sylist=new ArrayList<>();

        //增
        sylist.add("sy");
        sylist.add("is");
        sylist.add("an");
        sylist.add("girl");
        sylist.add(3,"ordinary");
        System.out.println(sylist.toString());

        //删

        //直接删除元素，按元素值删除
        //sylist.remove("sy");

        //按下标删除，删除下标为1的元素
        sylist.remove(2);

        //改
        sylist.set(2,"ordinary");
        System.out.println(sylist);

        //查
        //1、通过下标遍历
        for(int i=0;i<sylist.size();i++){
            System.out.println(sylist.get(i)+" good");
        }
        System.out.println("------分隔线---------");
        //2、通过for each循环遍历
        for (String s : sylist) {
            System.out.println("这是for循环 "+s);
        }
        //3、iterator循环
        Iterator<String> lit = sylist.iterator();
        while(lit.hasNext()){
            System.out.println("这是iterator循环 "+lit.next());
        }


    }
}


