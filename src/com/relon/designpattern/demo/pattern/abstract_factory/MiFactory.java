package com.relon.designpattern.demo.pattern.abstract_factory;

/**
 * С������������С��ϵ�в�Ʒ
 */
public class MiFactory implements OemFactory{
    @Override
    public MobilePhone produceMobile() {
        System.out.println("С������������С���ֻ�");
        return new MiPhone();
    }

    @Override
    public Tablet produceTablet() {
        System.out.println("С������������С��ƽ��");
        return new MiPad();
    }
}
