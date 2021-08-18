package com.relon.designpattern.demo.pattern.factory_method;

public class BenzFactory implements CarFactory{
    @Override
    public Car produce() {
        System.out.println("奔驰工厂生产奔驰。。。");
        return new Benz();
    }
}
