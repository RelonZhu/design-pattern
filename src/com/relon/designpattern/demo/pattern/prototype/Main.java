package com.relon.designpattern.demo.pattern.prototype;

public class Main {
    public static void main(String[] args) {
        WuKong wuKong = new WuKong();
        wuKong.setName("�����");
        wuKong.setAddress("����ɽˮ����");
        System.out.println("���������" + wuKong);
        WuKong newWuKong = wuKong.clone();
        System.out.println("����ջ���" + newWuKong);
        System.out.println("�����뻯���Ƿ���ͬһ����" + (wuKong == newWuKong));
        System.out.println("�����Ƿ���ͬ��" + (wuKong.getClass() == newWuKong.getClass()));
    }
}
