package com.relon.designpattern.demo.pattern.factory_method;

public class AudiFactory implements CarFactory{
    @Override
    public Car produce() {
        System.out.println("�µϹ��������µϡ�����");
        return new Audi();
    }
}
