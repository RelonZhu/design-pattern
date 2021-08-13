package com.relon.designpattern.demo.pattern.singleton;

/**
 * ����ʽ����ģʽ��������˽�о�̬����ʵ��
 * �ص㣺
 * ͬHungarySingletonA
 */
public class HungrySingletonB {
    // 1.˽�л�����������ֹ�ⲿ����
    private HungrySingletonB() {}
    // 2. ����˽�ж���
    private static HungrySingletonB instance;
    // 3. ��̬������ʼ��
    static {
        instance = new HungrySingletonB();
    }
    // 4. �ṩ������ȡ���󷽷�
    public static HungrySingletonB getInstance() {
        return instance;
    }
}
