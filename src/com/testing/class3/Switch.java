package com.testing.class3;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.println("请输入已送的东西");
        Scanner thing =new Scanner(System.in);
        String gift =thing.nextLine();

        switch(gift){
            case("花"):
                System.out.println("收到一束花");
                break;
            case("车"):
                System.out.println("收到一辆特斯拉");
                break;
            case("房"):
                System.out.println("很大的房子");
                break;
            default:
                break;
        }
    }
}
