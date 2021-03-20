package com.testing.class1;

public class FloatTest {
    public static void main(String[] args){

        float fa=1.66f;
        //先把1.66转换成float，会截断一部分，再转换为double时，截断的部分会补0
        double da=(float)1.66;

        System.out.println(fa);
        System.out.println(da);

        float fb=1.6666666666666f;
        double db=1.6666666666666;

        //float能表示的小数点后精度的位数，没有double那么长，但也不是double单纯的二分之一长度
        System.out.println("fb的值为：" + fb);
        System.out.println("db的值为：" + db);


    }
}
