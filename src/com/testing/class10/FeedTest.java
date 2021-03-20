package com.testing.class10;

import com.testing.class9.Animal;
import com.testing.class9.Birds;
import com.testing.class9.Mammals;

public class FeedTest {
    public static void main(String[] args) {

        Animal an = new Mammals();
        Animal bi = new Birds();

        Birds bird=new Birds();
        Feeder sy=new Feeder();
        //向上转型能够自动完成
        sy.feed(an);
        sy.feed(bi);
        sy.feed(bird);
        //向下转型需要手动指定需要转换的类型
//        sy.palyWithBirds(bi);
        sy.palyWithBirds(bird);
        sy.palyWithMammals((Mammals) an);

    }
}
