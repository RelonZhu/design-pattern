package com.relon.designpattern.demo.principles.dip;

public class MaleDriver implements IDriver{
    /**
     * ���������ǿ���һ�����⣬���û��IVehicle�ӿڵĻ�����ô˾����ʻ��Ϊ���ܾ�����������
     * ������ȷʵû��ʲô���⣬���ǳ���һ�������ε����飬˾��ֻ�ܿ��µϣ������������Ȩ��Ҳû��
     * �����������õ�ԭ�򣬾Ϳ�����driveNew()������������
     */
    @Override
    public void drive() {
        Audi audi = new Audi();
        audi.run();
    }

    /**
     * ��������һ������ӿڣ����������ڲ��ͱ��������ʹ�ò���Main.class
     * @param vehicle
     */
    @Override
    public void driveNew(IVehicle vehicle) {
        vehicle.run();
    }
}
