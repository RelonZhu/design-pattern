package com.relon.designpattern.demo.pattern.singleton;

public class MainTest {
    public static void main(String[] args) {
        // ���Զ���ʽ-��̬����
        HungrySingletonA singletonA = HungrySingletonA.getInstance();
        HungrySingletonA singletonB = HungrySingletonA.getInstance();
        System.out.println("����ʽ-��̬�������ɵĵ��������Ƿ���ͬ��" + (singletonA == singletonB));
        // ���Զ���ʽ-��̬�����
        HungrySingletonB singletonC = HungrySingletonB.getInstance();
        HungrySingletonB singletonD = HungrySingletonB.getInstance();
        System.out.println("����ʽ-��̬��������ɵĵ��������Ƿ���ͬ��" + (singletonC == singletonD));
        // ��������ʽ-���̰߳�ȫ
        LazySingletonA singletonE = LazySingletonA.getInstance();
        LazySingletonA singletonF = LazySingletonA.getInstance();
        System.out.println("����ʽ-���̰߳�ȫ��ʽ���ɵĵ��������Ƿ���ͬ��" + (singletonE == singletonF));
        // ��������ʽ-�߳�ͬ��
        LazySingletonB singletonG = LazySingletonB.getInstance();
        LazySingletonB singletonH = LazySingletonB.getInstance();
        System.out.println("����ʽ-�̰߳�ȫ��ʽ���ɵĵ��������Ƿ���ͬ��" + (singletonG == singletonH));
        // ˫�ؼ���
        DoubleCheckSingleton singletonI = DoubleCheckSingleton.getInstance();
        DoubleCheckSingleton singletonJ = DoubleCheckSingleton.getInstance();
        System.out.println("˫�ؼ�������ģʽ���ɵĵ��������Ƿ���ͬ��" + (singletonI == singletonJ));
        // ��̬�ڲ���
        StaticInnerClassSingleton singletonK = StaticInnerClassSingleton.getInstance();
        StaticInnerClassSingleton singletonL = StaticInnerClassSingleton.getInstance();
        System.out.println("��̬�ڲ��൥��ģʽ���ɵĵ��������Ƿ���ͬ��" + (singletonK == singletonL));
        // ����ö��
        SingletonEnum singletonM = SingletonEnum.INSTANCE;
        SingletonEnum singletonN = SingletonEnum.INSTANCE;
        System.out.println("����ö�ٵĵ���ģʽ���ɵĵ����Ƿ���ͬ��" + (singletonM == singletonN));
        // ͬ������ʹ�÷���
        SingletonEnum.INSTANCE.say();
    }
}
