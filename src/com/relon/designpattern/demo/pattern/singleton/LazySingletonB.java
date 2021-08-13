package com.relon.designpattern.demo.pattern.singleton;

/**
 * ����ʽ����ģʽ�����̰߳�ȫ
 * �ص㣺
 * 1.��ȡʱΪ�ղŴ��������������ص�����
 * 2.������̰߳�ȫ����
 * 3.����������ͬ������ζ�Ŷ��̳߳����£�ÿ���̻߳�ȡ��������ʱ����Ҫ����ͬ����Ч�ʽϵ�
 * ������ʹ��
 */
public class LazySingletonB {
    // 1.˽�й��캯��
    private LazySingletonB() {}
    // 2.������������
    private static LazySingletonB instance;
    // 3.��ȡʵ��
    public synchronized static LazySingletonB getInstance() {
        if (instance == null) {
            instance = new LazySingletonB();
        }
        return instance;
    }
}
