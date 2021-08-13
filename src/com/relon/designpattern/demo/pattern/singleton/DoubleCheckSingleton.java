package com.relon.designpattern.demo.pattern.singleton;

/**
 * 双重检锁单例模式
 * 特点：
 * 1.懒加载
 * 2.线程安全
 * 3.降低了同步的粒度，且实例化代码只执行了一次，效率较高
 * 推荐
 */
public class DoubleCheckSingleton {
    // 1.私有构造函数
    private DoubleCheckSingleton() {}
    // 2.声明单例对象——volatile作用保证可见性
    private static volatile DoubleCheckSingleton instance;
    // 3.获取实例
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
