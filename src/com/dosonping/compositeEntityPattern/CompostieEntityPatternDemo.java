package com.dosonping.compositeEntityPattern;
//使用client来演示组合实体设计模块
public class CompostieEntityPatternDemo {
    public static void main(String[] args) {
        Client client = new Client();
        client.setData("Test","Data");
        client.printData();
        client.setData("Second Test", "Data1");
        client.printData();
    }
}
