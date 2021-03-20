package com.testing.class6;

public class StringArgs {
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);

        String param1=args[0];
        String param2=args[1];


        try {
            Integer int1=Integer.parseInt(param1);
            Integer int2=Integer.parseInt(param2);
            Integer max=int1;
            if(int1<int2){
                max=int2;
                System.out.println("最大的数是第2个参数"+param2);
            }
            else if(int1.equals(int2)){
                System.out.println("两个参数一样大");
            }
            else {
                System.out.println("最大的数是第1个参数"+param1);
            }
        } catch (Exception e) {
            System.out.println("非数字输入，请输入数字");
        }


    }
}
