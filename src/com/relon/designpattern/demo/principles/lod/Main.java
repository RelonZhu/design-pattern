package com.relon.designpattern.demo.principles.lod;

public class Main {
    public static void main(String[] args) {
        BusinessCompany com = new BusinessCompany("王铁蛋集团");
        com.signDirectly(new Star("葛二蛋"));
        // 虽然上述过程也没有什么问题，但是从职责角度来看，明星是不太可能直接跳过经纪人的，所以把方法改造一下变成下面这样
        Agent agent = new Agent();
        agent.setCompany(new BusinessCompany("王铁蛋集团"));
        agent.setStar(new Star("葛二蛋"));
        // 这样经纪人就明星和商业资源
        agent.signByAgent();
        /**
         * 信息专家模式告诉我们：“信息的持有者即为操作该信息的专家。”也就是说Agent对象持有BusinessCompany和Star对象，那么对其进行
         * 操作的也应该是Agent对象
         */

    }
}
