package com.testing.class8;

import java.util.Arrays;

public class ReverseSort {
    public static void main(String[] args) {
        int[] input={3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        bubblesort(input);
//        selectsort(input);
    }
    //冒泡排序，逆序，从队尾到队首
    public static void bubblesort(int[] a){
        int temp;
        //共需要轮询length-1次
        for(int i=1;i<a.length-1;i++){
            for(int index=a.length-1;index>=i;index--){
                if(a[index-1]<a[index]){
                    temp=a[index];
                    a[index]=a[index-1];
                    a[index-1]=temp;
                }
            }
            System.out.println(Arrays.toString(a));
        }
    }
    //选择排序，逆序，从队尾到队首
    public static void selectsort(int[] a){
        for(int i=0;i<a.length-1;i++){
            int maxnum=a[i];
            int maxindex=i;
            for(int index=a.length-1;index>=i;index--){
                if(a[index]>maxnum){
                    maxnum=a[index];
                    maxindex=index;
                }
            }
            if(maxindex!=i){
                a[maxindex]=a[i];
                a[i]=maxnum;
            }
        System.out.println(Arrays.toString(a));
        }
    }
}
