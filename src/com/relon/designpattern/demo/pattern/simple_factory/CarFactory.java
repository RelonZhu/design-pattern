package com.relon.designpattern.demo.pattern.simple_factory;

public class CarFactory {
    public static Car produceCar(CarTypeEnum carTypeEnum) {
        switch (carTypeEnum) {
            case AUDI:return new Audi();
            case BENZ:return new Benz();
            default:return null;
        }
    }
}
