package com.relon.designpattern.demo.principles.dip;

/**
 * 宝马实现行驶行为
 */
public class BMW implements IVehicle{
    @Override
    public void run() {
        System.out.println("宝马在路上行驶。。。");
    }
}
