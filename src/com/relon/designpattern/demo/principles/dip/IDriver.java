package com.relon.designpattern.demo.principles.dip;

/**
 * ˾����ӿڣ������ʻ��Ϊ
 * �������������ֻΪ������ʹ�ã�������ʵ��Ӧ�ó���
 */
public interface IDriver {
    void drive();

    void driveNew(IVehicle vehicle);
}
