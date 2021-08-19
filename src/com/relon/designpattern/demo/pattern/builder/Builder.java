package com.relon.designpattern.demo.pattern.builder;

/**
 * ��������
 */
public interface Builder {
    /**
     * ����
     */
    Computer newComputer();

    void buildCpu(String cpu);
    void buildMemory(String memory);
    void buildGpu(String gpu);
    void buildMainBoard(String mainBoard);
    void buildNic(String nic);
}
