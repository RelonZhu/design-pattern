package com.relon.designpattern.demo.pattern.singleton;

/**
 * 懒汉式单例模式——非线程安全
 * 特点：
 * 1.获取时为空才创建，起到了懒加载的作用
 * 2.多线程场景下，若多个线程同时进入if判断分支，则很有可能出现线程安全问题
 * 不建议使用
 */
public class LazySingletonA {
    // 1.私有构造函数
    private LazySingletonA() {}
    // 2.声明单例对象
    private static LazySingletonA instance;
    // 3.获取实例
    public static LazySingletonA getInstance() {
        if (instance == null) {
            instance = new LazySingletonA();
        }
        return instance;
    }

}
