package com.dosonping.frontControllerPattern;
//使用FrontCrntroller来演示前端控制器设计模式
public class FrontControllerPatternDemo {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
    }
}
