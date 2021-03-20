package com.testing.class5;

import java.util.Arrays;

public class MutiTableArray {
    public static void main(String[] args) {
        printTable(creatTable());
    }


    public static String[][] creatTable() {
        String[][] table = new String[9][9];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j <= i; j++) {
                table[i][j] = (j + 1) + "x" + (i + 1) + "=" + (i + 1) * (j + 1);
            }
        }
        return table;
    }
    public static void printTable(String[][] res){
        for (String[] re : res) {
            for (String s : re) {
                if(s!=null){
                    System.out.print(s+"\t");
                }

            }
            System.out.println();
        }
    }
}


    //下标形式输出
//        for(int i=0;i<str.length;i++){
//            for (int j=0;j<str[i].length;j++){
//                if(j<=i){
//                    str[i][j]=(j+1)+"x"+(i+1)+"="+(i+1)*(j+1);
//                    System.out.print(str[i][j]+"\t");
//                }
//            }
//            System.out.println();
//        }

