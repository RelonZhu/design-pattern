package com.relon.designpattern.demo.pattern.simple_factory;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        // 生产奔驰
        Car benz = CarFactory.produceCar(CarTypeEnum.BENZ);
        benz.run();
        // 生产奥迪
        Car audi = CarFactory.produceCar(CarTypeEnum.AUDI);
        audi.run();
    }
}
