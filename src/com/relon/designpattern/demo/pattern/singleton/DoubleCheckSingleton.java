package com.relon.designpattern.demo.pattern.singleton;

/**
 * ˫�ؼ�������ģʽ
 * �ص㣺
 * 1.������
 * 2.�̰߳�ȫ
 * 3.������ͬ�������ȣ���ʵ��������ִֻ����һ�Σ�Ч�ʽϸ�
 * �Ƽ�
 */
public class DoubleCheckSingleton {
    // 1.˽�й��캯��
    private DoubleCheckSingleton() {}
    // 2.�����������󡪡�volatile���ñ�֤�ɼ���
    private static volatile DoubleCheckSingleton instance;
    // 3.��ȡʵ��
    public static DoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
