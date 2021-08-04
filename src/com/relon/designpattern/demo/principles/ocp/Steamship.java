package com.relon.designpattern.demo.principles.ocp;

public class Steamship implements IShip{

    private String name;

    public Steamship(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + "在海里运行");
    }
}
