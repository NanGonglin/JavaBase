package com.testing.class5;

import java.util.Arrays;

public class DoubleArray {
    public static void main(String[] args) {
        //二维数组
        String[][] doubleS = new String[3][6];
        System.out.println(doubleS);

        for (String[] adouble : doubleS) {
            System.out.println(adouble);
        }

        doubleS[0] = new String[]{"风", "味", "酸", "牛", "奶", "。"};
        String[] second = {"a", "b", "c", "d", "d", "d", "d"};
        doubleS[1] = second;
        //遍历二维数组，里面的每个元素都是一维数组
        for (String[] aDouble : doubleS) {
            System.out.println(Arrays.toString(aDouble));
        }
        //增强型for each 循环
        //遍历数组的所有元素的值，用双层循环,
        for (String[] aDouble : doubleS) {
            for (String s : aDouble) {
                System.out.print(s+" ");
            }
            System.out.println();
        }
        //下标循环
        //遍历2维数组
        for(int i=0;i<doubleS.length;i++){
            //遍历1维数组
            for(int ii=0;ii<doubleS[i].length;ii++){
                System.out.print(doubleS[i][ii]+" ");
            }
            System.out.println();
        }



    }
}

