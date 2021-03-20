package com.testing.class2;

public class CaseTest {
    public static void main(String[] args){
        int x=4;
        int y=9;
        int z=11;

        System.out.println(x>5&& x<<8-7>20 || !(x++<15));
        System.out.println(x);
        System.out.println(y>5&& y<<8-7>20 || !(y++<15));
        System.out.println(y);
        System.out.println(z>5&& z<<8-7>20 || !(z++<15));
        System.out.println(z);


        System.out.println("------分隔线------");

        int a=4;
        int b=9;
        int c=11;

        System.out.println(a>5||a<<8-7>20 && !(a++<15));
        System.out.println(a);
        System.out.println(b>5||b<<8-7>20 && !(b++<15));
        System.out.println(b);
        System.out.println(c>5||c<<8-7>20 && !(c++<15));
        System.out.println(c);

        System.out.println("------分隔线------");

        int d=4;
        int e=9;
        int f=11;
        int g=15;


        System.out.println(d<5 ||!(d++ < 15)&&d<<8-7>20);
        System.out.println(d);
        System.out.println(e<5 ||!(e++ < 15)&&e<<8-7>20);
        System.out.println(e);
        System.out.println(f<5 ||!(f++ < 15)&&f<<8-7>20);
        System.out.println(f);
        System.out.println(g<5 ||!(g++ < 15)&&g<<8-7>20);
        System.out.println(g);


    }
}
