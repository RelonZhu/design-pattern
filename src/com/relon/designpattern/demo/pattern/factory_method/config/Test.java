package com.relon.designpattern.demo.pattern.factory_method.config;

import com.relon.designpattern.demo.pattern.factory_method.Car;
import com.relon.designpattern.demo.pattern.factory_method.CarFactory;

public class Test {
    public static void main(String[] args) {
        CarFactory audiFactory = (CarFactory) FactoryConfigReader.getFactory("Audi");
        Car audi = audiFactory.produce();
        audi.run();

    }
}
