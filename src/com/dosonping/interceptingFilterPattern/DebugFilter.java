package com.dosonping.interceptingFilterPattern;
//创建实体过滤器
public class DebugFilter implements Filter{
    @Override
    public void execute(String request) {
        System.out.println("request log: " + request);
    }
}
