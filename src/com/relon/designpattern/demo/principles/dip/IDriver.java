package com.relon.designpattern.demo.principles.dip;

/**
 * 司机类接口，定义驾驶行为
 * 这里的两个方法只为做区分使用，不代表实际应用场景
 */
public interface IDriver {
    void drive();

    void driveNew(IVehicle vehicle);
}
