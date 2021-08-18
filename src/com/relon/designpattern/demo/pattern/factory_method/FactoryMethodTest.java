package com.relon.designpattern.demo.pattern.factory_method;

public class FactoryMethodTest {
    public static void main(String[] args) {
        // 调用奔驰工厂生产奔驰
        CarFactory benzFactory = new BenzFactory();
        Car benz = benzFactory.produce();
        benz.run();
        // 调用奥迪工厂生产奥迪
        CarFactory audiFactory = new AudiFactory();
        Car audi = audiFactory.produce();
        audi.run();
    }
}
