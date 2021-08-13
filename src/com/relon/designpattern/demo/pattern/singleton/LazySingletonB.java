package com.relon.designpattern.demo.pattern.singleton;

/**
 * 懒汉式单例模式——线程安全
 * 特点：
 * 1.获取时为空才创建，起到了懒加载的作用
 * 2.解决了线程安全问题
 * 3.对整个方法同步，意味着多线程场景下，每个线程获取单例对象时都需要进行同步，效率较低
 * 不建议使用
 */
public class LazySingletonB {
    // 1.私有构造函数
    private LazySingletonB() {}
    // 2.声明单例对象
    private static LazySingletonB instance;
    // 3.获取实例
    public synchronized static LazySingletonB getInstance() {
        if (instance == null) {
            instance = new LazySingletonB();
        }
        return instance;
    }
}
