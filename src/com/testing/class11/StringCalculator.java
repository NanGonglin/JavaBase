package com.testing.class11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Classname StringCalculator
 * @Description 类型说明
 * @Date 2021/3/2 15:52
 * @Created by 小白sy
 */
public class StringCalculator {
    public static void main(String[] args) {
        add(null, "22");
        add("33", null);
        add("33a", "11");
        add("33", "11a");
        add("33", "-11");
        add("-33", "11");
        add("22", "0");
        add("11", "22");
    }

    public static void add(String str1, String str2) {
        String split = "\"";
        String regex = "(-?\\d+)";
        Integer[] num = new Integer[2];
        Integer result;
        if (str1 != null && str2 != null) {
            if (str1.matches(regex) && str2.matches(regex)) {
                //创建一个模板
                Pattern intPattern=Pattern.compile(regex);
                //创建2个匹配器
                Matcher intMatcher1=intPattern.matcher(str1);
                Matcher intMatcher2=intPattern.matcher(str2);
                //查找一下
                intMatcher1.find();
                intMatcher2.find();
                //赋值
                num[0] = Integer.parseInt(intMatcher1.group(1));
                num[1] = Integer.parseInt(intMatcher2.group(1));
                if (num[0] >= 0 && num[1] >= 0) {
                    result = num[0] + num[1];
                    System.out.println(num[0] + "+" + num[1] + "=" + result);
                } else {
                    System.out.println("测试数据需要为大于等于0的数");
                }
            } else {
                System.out.println("输入的字符不是纯数字，无法计算");
            }
        } else {
            System.out.println("测试数据含有空值");
        }
    }
}
