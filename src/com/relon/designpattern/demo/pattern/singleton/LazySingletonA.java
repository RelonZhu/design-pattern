package com.relon.designpattern.demo.pattern.singleton;

/**
 * ����ʽ����ģʽ�������̰߳�ȫ
 * �ص㣺
 * 1.��ȡʱΪ�ղŴ��������������ص�����
 * 2.���̳߳����£�������߳�ͬʱ����if�жϷ�֧������п��ܳ����̰߳�ȫ����
 * ������ʹ��
 */
public class LazySingletonA {
    // 1.˽�й��캯��
    private LazySingletonA() {}
    // 2.������������
    private static LazySingletonA instance;
    // 3.��ȡʵ��
    public static LazySingletonA getInstance() {
        if (instance == null) {
            instance = new LazySingletonA();
        }
        return instance;
    }

}
