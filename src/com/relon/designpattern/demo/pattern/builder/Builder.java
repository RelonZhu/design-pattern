package com.relon.designpattern.demo.pattern.builder;

/**
 * 抽象构造器
 */
public interface Builder {
    /**
     * 电脑
     */
    Computer newComputer();

    void buildCpu(String cpu);
    void buildMemory(String memory);
    void buildGpu(String gpu);
    void buildMainBoard(String mainBoard);
    void buildNic(String nic);
}
