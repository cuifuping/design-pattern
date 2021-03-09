package com.dosonping.interceptingFilterPattern;
//创建Target
public class Target {
    public void execute(String request) {
        System.out.println("Executing request:" + request);
    }
}
