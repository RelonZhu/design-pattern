package com.relon.designpattern.demo.pattern.abstract_factory;

public class MiPhone implements MobilePhone{
    @Override
    public void call() {
        System.out.println("使用小米手机打电话。。。");
    }
}
