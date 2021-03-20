package com.testing.class9;

import java.util.Arrays;

public class QuickSortLast {
    public static void main(String[] args) {
        int[] input = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
//        int[] input = {3, 44, 38, 5, 47,15};
        quicksort(input, 0,input.length-1);
        System.out.println(Arrays.toString(input));
    }
    public static int[] quicksort(int[] a,int low,int high){
        int left=low;
        int right=high;
        //以最右边的数为基准
        int base=a[right];
        while (left<right){
            //先从左向右遍历
            while(left<right) {
                if (a[left] < base) {
                    left++;
                }
                else {
                    int temp;
                    temp = a[left];
                    a[left] = a[right];
                    a[right] = temp;
                    right--;
                    break;
                }
            }
            //再从右向左遍历
            while(left<right){
                if(a[right]>base){
                    right--;
                }
                else{
                    int temp=a[left];
                    a[left]=a[right];
                    a[right]=temp;
                    left++;
                    break;
                }
            }
        }//完成一轮的遍历

        if(left-1>low){
            //继续将左边的数递归排序
            quicksort(a, low, left-1);
        }
        else{

        }
        if(right+1<high){
            //继续将右边的数递归排序
            quicksort(a, right+1,high);
        }
        else{

        }
        return a;
    }
}
