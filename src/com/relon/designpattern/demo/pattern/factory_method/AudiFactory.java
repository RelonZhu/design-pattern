package com.relon.designpattern.demo.pattern.factory_method;

public class AudiFactory implements CarFactory{
    @Override
    public Car produce() {
        System.out.println("奥迪工厂生产奥迪。。。");
        return new Audi();
    }
}
