package com.testing.class6;

public class StringFormat {
    public static void main(String[] sy) {

        //将其他类型转换成String类型
        int a=123;
        String str=a+"1";
        System.out.println("将其他类型转换成String类型");
        System.out.println(str);

        //int类型是基本数据类型，没有toString的方法
        //a.toString();
        //只有类类型才能使用toString方法
        Integer ia=a;
        ia.toString();
        System.out.println("类类型的数据转换成String类型");
        System.out.println(ia);

        //将String转换成其他类型
        String s="123";
        System.out.println("将String类型转换成其他类型");
        System.out .println(s+1);
        //调用对应得包装类型的parse方法来进行字符串的转换
        int i = Integer.parseInt(s);
        Integer is=Integer.parseInt(s);
        //valueOf和parse都可以转换
        Integer.valueOf(s);
        System.out.println(i);
        System.out.println(is);

        String sf="1.533";
        //转换成int类型会报错：数字类型转换异常
        try {
            Integer.parseInt(sf);
        } catch (Exception e) {
            //输出堆栈信息
            e.printStackTrace();
            //可以自定义异常catch的内容
            System.out.println("数字类型转换异常");
        }
        Float ff = Float.parseFloat(sf);
        System.out.println(ff);

        //基本数据类型可以自动的低精度转高精度
        //包装后的类类型不能自动的低精度转高精度，强制转换也不行，因为Float和Double是两个不同的类
        double af =Float.parseFloat(sf);
        System.out.println(af);
        //Double bf=Float.parseFloat(sf);
        //Double bf=(Double)(Float.parseFloat(sf));

        Double df = Double.parseDouble(sf);
        System.out.println(df);



    }
}
