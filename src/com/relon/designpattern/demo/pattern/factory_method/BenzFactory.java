package com.relon.designpattern.demo.pattern.factory_method;

public class BenzFactory implements CarFactory{
    @Override
    public Car produce() {
        System.out.println("���۹����������ۡ�����");
        return new Benz();
    }
}
