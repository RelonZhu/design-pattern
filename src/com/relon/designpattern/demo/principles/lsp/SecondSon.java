package com.relon.designpattern.demo.principles.lsp;

public class SecondSon extends Father{
    @Override
    public void methodA() {
        System.out.println("子类重写父类methodA方法被调用");
    }
}
