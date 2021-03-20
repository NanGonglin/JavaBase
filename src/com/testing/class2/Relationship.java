package com.testing.class2;

public class Relationship {
    public static void main(String[] args){
        String s="roy";
        String s1="roy";
        String s2 = new String("roy");

        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);

        System.out.println("直接==判断s和s1的结果："+(s==s1));
        System.out.println("直接==判断s和s2的结果："+(s==s1));

        System.out.println("用equals方法进行判断："+(s.equals(s2)));

        boolean eq="roy".equals(s2);

    }
}
