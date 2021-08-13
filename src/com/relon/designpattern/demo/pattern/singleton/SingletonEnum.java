package com.relon.designpattern.demo.pattern.singleton;

/**
 * 基于枚举方式的单例模式
 * 特点：
 * 1.实现简单
 * 2.天然线程安全
 * 3.序列化/反序列化安全
 * 力荐
 * 为什么枚举是最好的单例实现？https://cloud.tencent.com/developer/article/1497592
 */
public enum SingletonEnum {
    INSTANCE;
    public void say() {
        System.out.println("实例的say方法被调用");
    }
}
