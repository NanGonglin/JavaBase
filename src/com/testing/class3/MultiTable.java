package com.testing.class3;

public class MultiTable {
    public static void main(String[] args) {
        //九九乘法表打印

        //1、全部打印出来
//        int i=0;
//        int j=0;
//        for(i=1;i<10;i++){
//            for(j=1;j<10;j++)
//            {
//                //print表示输出不换行
//                System.out.print(j+"x"+i+"="+i*j+"\t");
//            }
//            //println表示输出要换行
//            System.out.println();
//        }

        //2、打印一半,标准的乘法表
//        int i=0;
//        int j=0;
//        for(i=1;i<10;i++){
//        //j<=i关键条件
//            for(j=1;j<=i;j++)
//            {
//                //print表示输出不换行
//                System.out.print(j+"x"+i+"="+i*j+"\t");
//            }
//            //println表示输出要换行
//            System.out.println();
//        }

        //3、去一条对角线打印
//        int i=0;
//        int j=0;
//        for(i=1;i<10;i++){
//            for(j=1;j<10;j++)
//            {
//                //当j=i时，不打印乘法公式
//                if(i==j){
//                    //printf表示格式化输出
//                    System.out.printf("%10s","");
//                }
//                else{
//                    //print表示输出不换行
//                System.out.printf("%-10s",j+"x"+i+"="+i*j);
//                }
//            }
//            //println表示输出要换行
//            System.out.println();
//        }
        //4、去两条对角线打印
        int i=0;
        int j=0;
        for(i=1;i<10;i++){
            for(j=1;j<10;j++)
            {
                //当j=i时，不打印乘法公式
                if((i==j)||((i+j)==10)){
                    //printf表示格式化输出
                    System.out.printf("%10s","");
                }
//                else if((i+j)==10){
//                    System.out.printf("%10s","");
//                }
                else{
                    //print表示输出不换行
                System.out.printf("%-10s",j+"x"+i+"="+i*j);
                }
            }
            //println表示输出要换行
            System.out.println();
        }


    }
}
