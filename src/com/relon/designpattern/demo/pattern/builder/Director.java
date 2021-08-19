package com.relon.designpattern.demo.pattern.builder;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Computer buildComputer(String cpu, String gpu, String mainBoard, String memory, String nic) {
        builder.buildCpu(cpu);
        builder.buildMemory(memory);
        builder.buildGpu(gpu);
        builder.buildNic(nic);
        builder.buildMainBoard(mainBoard);
        return builder.newComputer();
    }
}
