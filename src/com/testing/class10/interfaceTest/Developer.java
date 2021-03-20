package com.testing.class10.interfaceTest;

public class Developer implements Employees {
    @Override
    public String work() {
        return "开发今天修改了很多bug";
    }

    @Override
    public String moyu() {
        return "怀疑开发在摸鱼";
    }

    @Override
    public void moyu(String methods) {
        System.out.println("开发可能摸鱼在"+methods);
    }
}
