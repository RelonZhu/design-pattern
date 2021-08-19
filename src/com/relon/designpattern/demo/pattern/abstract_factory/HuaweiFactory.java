package com.relon.designpattern.demo.pattern.abstract_factory;

/**
 * 华为生产线生产华为系列产品
 */
public class HuaweiFactory implements OemFactory{
    @Override
    public MobilePhone produceMobile() {
        System.out.println("华为生产线生产华为手机");
        return new HuaweiPhone();
    }

    @Override
    public Tablet produceTablet() {
        System.out.println("华为生产线生产华为平板");
        return new HuaweiPad();
    }
}
