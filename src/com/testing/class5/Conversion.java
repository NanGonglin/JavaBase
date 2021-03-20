package com.testing.class5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Conversion {
    public static void main(String[] args) {
        Integer[] a={1,2,3,4,5,6,7,8,9,0};

        Integer[] a2=new Integer[10];

        List<Integer> aList=new ArrayList<>();

        //使用for循环方法数组和链表互换
        //1、从数组中取值存到list中
//        for(int i=0;i<a.length;i++){
//            aList.add(a[i]);
//        }
//        for (Integer integer : aList) {
//            System.out.print(integer+",");
//        }
//
//        System.out.println();
//
//        //2、从list取值赋值到新数组中
//        for (int i=0;i<a.length;i++) {
//            a2[9-i]=aList.get(i);
//        }
//        for (Integer a22 : a2) {
//            System.out.print(a22+",");
//        }

        //使用数组和链表中的方法实现互转
        //1、从数组中取值存到list中,使用数组的Array.asList方法
        List<Integer> bList= Arrays.asList(1,2,3,4,5,6,7,8,9,0);
        for (Integer b : bList) {
            System.out.print(b+",");
        }
        System.out.println();
        //2、从list取值赋值到新数组中，使用list的toArray方法
        bList.toArray(a2);
        for (Integer a22 : a2) {
            System.out.print(a22+",");
        }
    }
}
