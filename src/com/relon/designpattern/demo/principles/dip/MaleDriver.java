package com.relon.designpattern.demo.principles.dip;

public class MaleDriver implements IDriver{
    /**
     * 到这里我们考虑一个问题，如果没有IVehicle接口的话，那么司机驾驶行为可能就是下面这样
     * 这样看确实没有什么问题，但是出现一个很尴尬的事情，司机只能开奥迪，连换开宝马的权利也没有
     * 基于依赖倒置的原则，就可以像driveNew()方法这样定义
     */
    @Override
    public void drive() {
        Audi audi = new Audi();
        audi.run();
    }

    /**
     * 方法接收一个抽象接口，这样方法内部就变成这样，使用参照Main.class
     * @param vehicle
     */
    @Override
    public void driveNew(IVehicle vehicle) {
        vehicle.run();
    }
}
