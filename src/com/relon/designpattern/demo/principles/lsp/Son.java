package com.relon.designpattern.demo.principles.lsp;

import java.util.HashMap;
import java.util.Map;

public class Son extends Father{

    public void methodAA() {
        System.out.println("�������з���methodAA�����á�����");
    }

    public void methodB(Map map) {
        System.out.println("�������ظ���methodB���������á�����");
    }

    public void methodC(HashMap map) {
        System.out.println("�������ص�methodC����������");
    }
}
