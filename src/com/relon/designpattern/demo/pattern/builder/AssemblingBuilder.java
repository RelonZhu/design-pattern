package com.relon.designpattern.demo.pattern.builder;

public class AssemblingBuilder implements Builder {
    Computer computer = new Computer();
    @Override
    public Computer newComputer() {
        return computer;
    }

    @Override
    public void buildCpu(String cpu) {
        this.computer.setCpu(cpu);
    }

    @Override
    public void buildMemory(String memory) {
        this.computer.setMemory(memory);
    }

    @Override
    public void buildGpu(String gpu) {
        this.computer.setGpu(gpu);
    }

    @Override
    public void buildMainBoard(String mainBoard) {
        this.computer.setMainBoard(mainBoard);
    }

    @Override
    public void buildNic(String nic) {
        this.computer.setNic(nic);
    }
}
