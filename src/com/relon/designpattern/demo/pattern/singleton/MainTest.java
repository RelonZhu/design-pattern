package com.relon.designpattern.demo.pattern.singleton;

public class MainTest {
    public static void main(String[] args) {
        // 测试饿汉式-静态常量
        HungrySingletonA singletonA = HungrySingletonA.getInstance();
        HungrySingletonA singletonB = HungrySingletonA.getInstance();
        System.out.println("饿汉式-静态常量生成的单例对象是否相同：" + (singletonA == singletonB));
        // 测试饿汉式-静态代码块
        HungrySingletonB singletonC = HungrySingletonB.getInstance();
        HungrySingletonB singletonD = HungrySingletonB.getInstance();
        System.out.println("饿汉式-静态代码块生成的单例对象是否相同：" + (singletonC == singletonD));
        // 测试懒汉式-非线程安全
        LazySingletonA singletonE = LazySingletonA.getInstance();
        LazySingletonA singletonF = LazySingletonA.getInstance();
        System.out.println("懒汉式-非线程安全方式生成的单例对象是否相同：" + (singletonE == singletonF));
        // 测试懒汉式-线程同步
        LazySingletonB singletonG = LazySingletonB.getInstance();
        LazySingletonB singletonH = LazySingletonB.getInstance();
        System.out.println("懒汉式-线程安全方式生成的单例对象是否相同：" + (singletonG == singletonH));
        // 双重检锁
        DoubleCheckSingleton singletonI = DoubleCheckSingleton.getInstance();
        DoubleCheckSingleton singletonJ = DoubleCheckSingleton.getInstance();
        System.out.println("双重检锁单例模式生成的单例对象是否相同：" + (singletonI == singletonJ));
        // 静态内部类
        StaticInnerClassSingleton singletonK = StaticInnerClassSingleton.getInstance();
        StaticInnerClassSingleton singletonL = StaticInnerClassSingleton.getInstance();
        System.out.println("静态内部类单例模式生成的单例对象是否相同：" + (singletonK == singletonL));
        // 基于枚举
        SingletonEnum singletonM = SingletonEnum.INSTANCE;
        SingletonEnum singletonN = SingletonEnum.INSTANCE;
        System.out.println("基于枚举的单例模式生成的单例是否相同：" + (singletonM == singletonN));
        // 同样可以使用方法
        SingletonEnum.INSTANCE.say();
    }
}
