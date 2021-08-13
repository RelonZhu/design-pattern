package com.relon.designpattern.demo.principles.lsp;

import java.util.HashMap;
import java.util.Map;

public class Son extends Father{

    public void methodAA() {
        System.out.println("子类特有方法methodAA被调用。。。");
    }

    public void methodB(Map map) {
        System.out.println("子类重载父类methodB方法被调用。。。");
    }

    public void methodC(HashMap map) {
        System.out.println("子类重载的methodC方法被调用");
    }
}
