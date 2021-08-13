package com.relon.designpattern.demo.pattern.singleton;

/**
 * 饿汉式单例模式——基于私有静态常量实现
 * 特点：
 * 1.代码简单
 * 2.类加载时立即创建了对象，若从未使用过则会造成内存浪费
 * 3.基于classloder机制避免了多线程的同步问题，不过，instance在类装载 时就实例化，在单例模式中大多数都是调用getInstance方法， 但是
 * 导致类装载 的原因有很多种，因此不能确定有其他的方式（或者其他的静态方法）导致类 装载，这时候初始化instance就没有达到lazy loading的效果
 */
public class HungrySingletonA {
    // 1.私有化构造器，防止外部创建
    private HungrySingletonA() {}
    // 2. 创建私有对象
    private static final HungrySingletonA instance = new HungrySingletonA();
    // 3. 提供公共获取对象方法
    public static HungrySingletonA getInstance() {
        return instance;
    }
}
