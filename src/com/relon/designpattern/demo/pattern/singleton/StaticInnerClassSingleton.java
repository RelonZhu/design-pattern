package com.relon.designpattern.demo.pattern.singleton;

/**
 * ��̬�ڲ���
 * �ص�
 * 1.�ڻ�ȡʵ��ʱ�Ż��ʼ��������������
 * 2.ֻ���ڻ�ȡʵ��ʱJVM�Ż�����ڲ��࣬�Ҿ�̬����ֻ���������ʱ��ʼ��һ�Σ������������ʱ�����߳��޷���ռ��JVM��Ȼ�ı�֤���̰߳�ȫ
 * 3.Ч�ʽϸ�
 * �Ƽ�ʹ��
 */
public class StaticInnerClassSingleton {
    // 1.˽�л����캯��
    private StaticInnerClassSingleton() {}
    // 2.���徲̬�ڲ���
    private static class InnerSingleton {
        private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }
    // 3.�ṩ��ȡʵ������
    public static StaticInnerClassSingleton getInstance() {
        return InnerSingleton.INSTANCE;
    }
}
