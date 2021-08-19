package com.relon.designpattern.demo.pattern.abstract_factory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        // ����С�ײ�Ʒ
        OemFactory miFactory = new MiFactory();
        MobilePhone miPhone = miFactory.produceMobile();
        miPhone.call();
        Tablet miPad = miFactory.produceTablet();
        miPad.play();
        // ������Ϊ��Ʒ
        OemFactory huaweiFactory = new HuaweiFactory();
        MobilePhone huaweiPhone = huaweiFactory.produceMobile();
        huaweiPhone.call();
        Tablet huaweiPad = huaweiFactory.produceTablet();
        huaweiPad.play();
    }
}
