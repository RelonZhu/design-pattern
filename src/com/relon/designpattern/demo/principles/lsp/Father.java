package com.relon.designpattern.demo.principles.lsp;

import java.util.HashMap;
import java.util.Map;

public class Father {
    public void methodA() {
        System.out.println("�����methodA������");
    }

    public void methodB(HashMap map) {
        System.out.println("�����methodB������");
    }

    public void methodC(Map map) {
        System.out.println("�����methodC������");
    }
}
