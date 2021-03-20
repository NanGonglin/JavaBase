package com.testing.class8;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] input = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        select(input);
    }

    public static void select(int[] a) {
        //需要length-1次循环
        for (int i = 1; i <= a.length - 1; i++) {
            //假设第一个数是最小值，当前的位置是最小数的下标
            int minimum = a[i - 1];
            int minindex = i - 1;
            //下标： 下标为lun-1的数最小，从lun到length-1
            for (int index = i; index <= a.length - 1; index++) {
                //如果当前值小于最小值，那么更新最小值和下标
                //每次用当前下标的值和最小值进行比较
                if (a[index]<minimum ) {
                    minindex = index;
                    minimum = a[index];
                }//否则不操作
            }
            //循环完成之后，找到最小值和它的下标
            //交换最小值和第一个数的位置
            if (minindex!=i-1) {
                //相当于已经有一个临时变量minnum了，交换的时候，先换a[minindex]
                a[minindex]=a[i-1];
                a[i-1]=minimum;
            }
            System.out.println(Arrays.toString(a));
        }

    }
}
