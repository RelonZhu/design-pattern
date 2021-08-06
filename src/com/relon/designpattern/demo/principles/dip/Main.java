package com.relon.designpattern.demo.principles.dip;

public class Main {
    public static void main(String[] args) {
        // 这样只能够驾驶奥迪，显然不太合理，于是可以变成下面这样
        MaleDriver audiDriver = new MaleDriver();
        audiDriver.drive();

        // 改进后就既可以驾驶奥迪又可以驾驶宝马
        MaleDriver allDriver = new MaleDriver();
        allDriver.driveNew(new Audi());
        allDriver.driveNew(new BMW());
        // 上面虽然比较完美，但是还有一个问题就是MaleDriver allDriver = new MaleDriver();意味着仅有男性驾驶员，难道女性就不可以吗
        // 所以可以这样来定义——即变量的表面类型最好是接口或抽象类
        IDriver driver = new MaleDriver();
        //      这样driver的类型将依赖于实际的驾驶员类所创建的对象
    }
}
