package com.testing.class3;

import java.util.Scanner;

public class MoodGame {
    public static void main(String[] args) {
        //设置初始的好感度是20。
        int mood=20;
        Scanner PreGift = new Scanner(System.in);
        while(mood>0&&mood<100){
            System.out.println("请输入要送的礼物");

            String gift=PreGift.nextLine();
            switch(gift){

            case "花" :
                mood+=20;
                System.out.println("花很漂亮，当前好感度是"+mood);
                break;
            case "车":
                mood+=50;
                System.out.println("车很酷，当前好感度是"+mood);
                break;
            case "房":
                mood=100;
                System.out.println("房子很豪华，当前好感度是"+mood+",恭喜抱得美人归");
                break;
            case "":
                mood-=10;
                System.out.println("什么都没送，当前好感度是"+mood);

                break;
            default:
                break;
            }
        }

    }
}
