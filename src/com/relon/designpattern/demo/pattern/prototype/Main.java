package com.relon.designpattern.demo.pattern.prototype;

public class Main {
    public static void main(String[] args) {
        WuKong wuKong = new WuKong();
        wuKong.setName("孙悟空");
        wuKong.setAddress("花果山水帘洞");
        System.out.println("孙悟空真身：" + wuKong);
        WuKong newWuKong = wuKong.clone();
        System.out.println("孙悟空化身：" + newWuKong);
        System.out.println("真身与化身是否是同一个？" + (wuKong == newWuKong));
        System.out.println("真身是否相同？" + (wuKong.getClass() == newWuKong.getClass()));
    }
}
