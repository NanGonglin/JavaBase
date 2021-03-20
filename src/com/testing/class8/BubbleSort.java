package com.testing.class8;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] input = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        bubble(input);
    }


    public static void bubble(int[] a) {
        for (int lun = 1; lun <= a.length - 1; lun++) {
            for (int index = 0; index <= a.length - lun  - 1; index++) {
                if (a[index] > a[index + 1]) {
//                    int temp = a[index];
//                    a[index] = a[index + 1];
//                    a[index + 1] = temp;
                    exchange(a,index,index+1);
                }
            }System.out.println(Arrays.toString(a));
        }
    }
    public static void exchange(int[] a,int x,int y){
        int temp;
        temp=a[x];
        a[x]=a[y];
        a[y]=temp;
    }
}


