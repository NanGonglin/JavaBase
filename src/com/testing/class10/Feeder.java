package com.testing.class10;

import com.testing.class9.Animal;
import com.testing.class9.Birds;
import com.testing.class9.Mammals;

public class Feeder {
    //喂养操作，接收animal类型的参数
    public void feed(Animal an){
        System.out.println("饲养员正在给"+an.kind+"喂食");
        an.eat();
    }
    public void palyWithBirds(Birds bird) {
        System.out.println("饲养员在跟"+bird.kind+"玩飞盘游戏");
    }
    public void palyWithMammals(Mammals ma){
        System.out.println("饲养员在跟"+ma.kind+"玩踢球游戏");
    }
}
