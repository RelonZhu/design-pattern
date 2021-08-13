package com.relon.designpattern.demo.pattern.singleton;

/**
 * 静态内部类
 * 特点
 * 1.在获取实例时才会初始化，符合懒加载
 * 2.只有在获取实例时JVM才会加载内部类，且静态属性只会在类加载时初始化一次，另外在类加载时其他线程无法抢占，JVM天然的保证了线程安全
 * 3.效率较高
 * 推荐使用
 */
public class StaticInnerClassSingleton {
    // 1.私有化构造函数
    private StaticInnerClassSingleton() {}
    // 2.定义静态内部类
    private static class InnerSingleton {
        private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }
    // 3.提供获取实例方法
    public static StaticInnerClassSingleton getInstance() {
        return InnerSingleton.INSTANCE;
    }
}
