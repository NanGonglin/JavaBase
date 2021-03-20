package com.testing.class6;

public class StringTest {
    public static void main(String[] args) {
        String s="sy，是，个，Girl";
        //String s="123456789";
//        String s1= new String("sy");
//        boolean isEq = s.equals(s1);
//        System.out.println(isEq);
//
//        //substring字符截断方法
//        //从第2位截断，取第3位到最后一位
//        String sub1=s.substring(2);
//        System.out.println(sub1);
//        //从第2位截断，取第3位到第5位，左边不包含，右边包含
//        String sub2=s.substring(2,7);
//        System.out.println(sub2);
//
//        //contains判断是否包含字符方法
//        boolean isCon1 = s.contains(s1);
//        System.out.println(isCon1);
//
//        //split字符串分割成多个字段
//        String[] split = s.split("，");
//        for (String s2 : split) {
//            System.out.println(s2);
//        }
//
        //replace替换字符内容
        String reStr = s.replace("sy", "yy");
        System.out.println(reStr);

        //index寻找字符的第一个位置，没找到就返回值是-1
        int index = reStr.indexOf("y");
        System.out.println(index);
        //index寻找字符，从第几个字符开始找
        int index1 = s.indexOf("，", 5);
        System.out.println(index1);

        //last从字符串的最右侧找到返回下标值
        int index2 = s.lastIndexOf("y");
        System.out.println(index2);


    }
}
