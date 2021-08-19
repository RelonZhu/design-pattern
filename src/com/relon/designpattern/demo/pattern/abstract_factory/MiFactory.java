package com.relon.designpattern.demo.pattern.abstract_factory;

/**
 * 小米生产线生产小米系列产品
 */
public class MiFactory implements OemFactory{
    @Override
    public MobilePhone produceMobile() {
        System.out.println("小米生产线生产小米手机");
        return new MiPhone();
    }

    @Override
    public Tablet produceTablet() {
        System.out.println("小米生产线生产小米平板");
        return new MiPad();
    }
}
