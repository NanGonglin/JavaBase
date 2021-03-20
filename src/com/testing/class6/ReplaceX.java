package com.testing.class6;

public class ReplaceX {
    public static void main(String[] args) {
        String a="[1, 2, 37, 54, 4, 6, 9, 7, 8, 0]";
        System.out.println(a);

        String b=a;
//        b=a.replace("1","x");
//        b=b.replace("2","x");
//        b=b.replace("3","x");
//        b=b.replace("4","x");
//        b=b.replace("5","x");
//        System.out.println(a);
//        System.out.println(b);
//        for(int i=1;i<6;i++){
//            b=b.replace(i+"","x");
//        }
//        System.out.println(a);
//        System.out.println(b);

        //正则表达式替换
        String reg="[3-7]{2}";
        b=a.replaceAll(reg,"x");
        System.out.println(b);

        String spreg="[,\\[\\]]";
        String[] split=a.split(spreg);
        for (String s : split) {
            System.out.println(s.trim());
        }
    }
}
