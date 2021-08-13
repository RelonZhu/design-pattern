package com.relon.designpattern.demo.pattern.singleton;

/**
 * 饿汉式单例模式——基于私有静态常量实现
 * 特点：
 * 同HungarySingletonA
 */
public class HungrySingletonB {
    // 1.私有化构造器，防止外部创建
    private HungrySingletonB() {}
    // 2. 创建私有对象
    private static HungrySingletonB instance;
    // 3. 静态代码块初始化
    static {
        instance = new HungrySingletonB();
    }
    // 4. 提供公共获取对象方法
    public static HungrySingletonB getInstance() {
        return instance;
    }
}
