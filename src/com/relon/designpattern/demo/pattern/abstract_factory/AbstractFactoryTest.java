package com.relon.designpattern.demo.pattern.abstract_factory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        // 生产小米产品
        OemFactory miFactory = new MiFactory();
        MobilePhone miPhone = miFactory.produceMobile();
        miPhone.call();
        Tablet miPad = miFactory.produceTablet();
        miPad.play();
        // 生产华为产品
        OemFactory huaweiFactory = new HuaweiFactory();
        MobilePhone huaweiPhone = huaweiFactory.produceMobile();
        huaweiPhone.call();
        Tablet huaweiPad = huaweiFactory.produceTablet();
        huaweiPad.play();
    }
}
