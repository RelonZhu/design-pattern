package com.relon.designpattern.demo.pattern.singleton;

/**
 * ����ö�ٷ�ʽ�ĵ���ģʽ
 * �ص㣺
 * 1.ʵ�ּ�
 * 2.��Ȼ�̰߳�ȫ
 * 3.���л�/�����л���ȫ
 * ����
 * Ϊʲôö������õĵ���ʵ�֣�https://cloud.tencent.com/developer/article/1497592
 */
public enum SingletonEnum {
    INSTANCE;
    public void say() {
        System.out.println("ʵ����say����������");
    }
}
