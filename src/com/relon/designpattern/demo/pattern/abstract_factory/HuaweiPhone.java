package com.relon.designpattern.demo.pattern.abstract_factory;

public class HuaweiPhone implements MobilePhone{
    @Override
    public void call() {
        System.out.println("使用华为手机打电话。。。");
    }
}
