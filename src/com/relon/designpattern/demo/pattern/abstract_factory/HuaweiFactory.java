package com.relon.designpattern.demo.pattern.abstract_factory;

/**
 * ��Ϊ������������Ϊϵ�в�Ʒ
 */
public class HuaweiFactory implements OemFactory{
    @Override
    public MobilePhone produceMobile() {
        System.out.println("��Ϊ������������Ϊ�ֻ�");
        return new HuaweiPhone();
    }

    @Override
    public Tablet produceTablet() {
        System.out.println("��Ϊ������������Ϊƽ��");
        return new HuaweiPad();
    }
}
