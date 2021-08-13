package com.relon.designpattern.demo.pattern.singleton;

/**
 * ����ʽ����ģʽ��������˽�о�̬����ʵ��
 * �ص㣺
 * 1.�����
 * 2.�����ʱ���������˶�������δʹ�ù��������ڴ��˷�
 * 3.����classloder���Ʊ����˶��̵߳�ͬ�����⣬������instance����װ�� ʱ��ʵ�������ڵ���ģʽ�д�������ǵ���getInstance������ ����
 * ������װ�� ��ԭ���кܶ��֣���˲���ȷ���������ķ�ʽ�����������ľ�̬������������ װ�أ���ʱ���ʼ��instance��û�дﵽlazy loading��Ч��
 */
public class HungrySingletonA {
    // 1.˽�л�����������ֹ�ⲿ����
    private HungrySingletonA() {}
    // 2. ����˽�ж���
    private static final HungrySingletonA instance = new HungrySingletonA();
    // 3. �ṩ������ȡ���󷽷�
    public static HungrySingletonA getInstance() {
        return instance;
    }
}
