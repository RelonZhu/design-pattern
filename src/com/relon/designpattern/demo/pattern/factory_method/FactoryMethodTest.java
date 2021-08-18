package com.relon.designpattern.demo.pattern.factory_method;

public class FactoryMethodTest {
    public static void main(String[] args) {
        // ���ñ��۹�����������
        CarFactory benzFactory = new BenzFactory();
        Car benz = benzFactory.produce();
        benz.run();
        // ���ðµϹ��������µ�
        CarFactory audiFactory = new AudiFactory();
        Car audi = audiFactory.produce();
        audi.run();
    }
}
