package com.relon.designpattern.demo.principles.lsp;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // 1.参数为父类时，可以使用子类代替而不会影响原有功能
        invokeMethodOfFather(new Father());
        invokeMethodOfFather(new Son());

        // 2.若子类重写父类非抽象方法（参见SecondSon）-> 那么原来希望调用父类方法的位置错误的调用了子类的方法
        invokerMethodBOfFather(new Father());
        invokerMethodBOfFather(new SecondSon());

        // 3.子类存在的位置替换为父类不一定成立
        // invokerMethodOfSon(new Father());

        // 4. 子类可以通过重载父类方法来放大请求参数类型，但反之不成立
        // 4.1 可以看到这种情况父子类调用的方法是一样的
        new Father().methodB(new HashMap());
        new Son().methodB(new HashMap());
        // 4.2 子类通过重载拓展的功能也能够正常调用，4.3将验证一下反过来的情况
        Map map = new HashMap();
        new Son().methodB(map);
        // 4.3 验证父类参数类型大于子类的情况 参见methodC()
        HashMap hashMap = new HashMap();
        Father f = new Father();
        f.methodC(hashMap);
        // 根据里氏替换原则，出现父类的位置都可以由子类代替，那么将上述代码替换为如下：
        Son son = new Son();
        son.methodC(hashMap);

    }

    /**
     * 调用父类方法——验证父类所在位置对象替换为子类时不会影响原有方法
     * 前提：子类没有重写父类已实现的方法
     * @param father
     */
    private static void invokeMethodOfFather(Father father) {
        father.methodA();
    }
    /**
     * 调用父类方法——验证子类重写父类已存在方法的不合理性
     * 前提：子类重写父类已实现的方法
     * @param f
     */
    public static void invokerMethodBOfFather(Father f) {
        f.methodA();
    }

    /**
     * 调用父类方法——验证子类重写父类已存在方法的不合理性
     * 前提：子类重写父类已实现的方法
     * @param f
     */
    public static void invokerMethodOfSon(Son f) {
        f.methodAA();
    }
}
