package com.dosonping.interceptingFilterPattern;
//创建实体过滤器
public class AuthenticationFilter implements Filter{
    @Override
    public void execute(String request) {
        System.out.println("Authentication request: " + request);
    }
}
