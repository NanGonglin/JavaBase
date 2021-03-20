package com.testing.class9;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] input = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
//        int[] input = {3, 44, 38, 5, 47,15};
        quicksort(input, 0,input.length-1);
        System.out.println(Arrays.toString(input));

    }
    //每次递归调用的时候，需要指定排序的下标范围，也就是low，high
    public static int[] quicksort(int[] a,int low,int high){
        //选择一个基准值，比如最左边left
        //需要两个指针，一个从左向右遍历，一个从右向左遍历
        int left=low;
        int right=high;
        int base=a[left];
        //循环往复的进行从右向左和从左向右的遍历，直到left=right时，才结束循环
        while(left<right){
            //因为基准值在最左边，所以先从右向左遍历
            while (left<right){
                //从右向左遍历的时候，如果基准值比右边的值小，那么不做操作
                if(base<a[right]){
                    right--;
                }
                //如果基准值比右边的值大，需要交换基准值和right下标对应的值，并且改变遍历方向
                else{
                    int temp;
                    temp=a[right];
                    a[right]=a[left];
                    a[left]=temp;
                    left++;
                    //改变遍历方向
                    break;
                }

            }
            //从左向右遍历
            while(left<right){
                //从左向右遍历的时候，如果基准值比左边的值大，那么不做操作
                if(a[left]<base){
                    left++;
                }
                //如果基准值比左边的值小，需要交换基准值和left下标对应的值，并且改变遍历方向
                else{
                    int temp;
                    temp=a[left];
                    a[left]=a[right];
                    a[right]=temp;
                    right--;
                    break;
                }

            }
        }//结束一轮的完整遍历，基准值的位置已经到了正确的位置，left=right，基准值就是left，也是right

        //左边排序，递归调用的出口 left-1 > low
        if(left-1>low){
            //剩余需要排序的范围是low，left-1
            quicksort(a, low, left-1);
        }
        else{
            //递归出口，不用排序了
        }

        //右边排序,递归调用的出口是right+1 > high
        if(right+1<high){
            quicksort(a, right+1, high);
        }
        else{
            //递归出口，不用排序了
        }
        System.out.println(Arrays.toString(a));
        return a;
    }
}
