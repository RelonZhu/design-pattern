package com.relon.designpattern.demo.pattern.prototype;

public class WuKong implements Cloneable{
    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "WuKong{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    protected WuKong clone() {
        WuKong newWuKong = null;
        try {
            newWuKong = (WuKong) super.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return newWuKong;
    }
}
