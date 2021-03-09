package com.dosonping.visitorPattern;
//定义一个表示访问者的接口。
public interface ComputerPartVisitor {
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
    public void visit(Mouse mouse);
    public void visit(Computer computer);
}
