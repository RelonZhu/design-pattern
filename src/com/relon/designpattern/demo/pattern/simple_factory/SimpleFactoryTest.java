package com.relon.designpattern.demo.pattern.simple_factory;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        // ��������
        Car benz = CarFactory.produceCar(CarTypeEnum.BENZ);
        benz.run();
        // �����µ�
        Car audi = CarFactory.produceCar(CarTypeEnum.AUDI);
        audi.run();
    }
}
