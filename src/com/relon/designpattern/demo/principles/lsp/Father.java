package com.relon.designpattern.demo.principles.lsp;

import java.util.HashMap;
import java.util.Map;

public class Father {
    public void methodA() {
        System.out.println("父类的methodA被调用");
    }

    public void methodB(HashMap map) {
        System.out.println("父类的methodB被调用");
    }

    public void methodC(Map map) {
        System.out.println("父类的methodC被调用");
    }
}
