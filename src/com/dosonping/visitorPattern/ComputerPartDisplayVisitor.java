package com.dosonping.visitorPattern;
//创建实现了上述类的实体访问者。
public class ComputerPartDisplayVisitor implements ComputerPartVisitor{
    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying keyboard");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying monitor");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying mouse");
    }

    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying computer");
    }
}
