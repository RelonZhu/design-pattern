package com.relon.designpattern.demo.pattern.prototype;

import java.io.Serializable;

/**
 * ÌÆÉ®
 */
public class Tang implements Cloneable, Serializable {
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
        return "Tang{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    protected Tang clone() throws CloneNotSupportedException {
        Tang tang = null;
        try {
            tang = (Tang) super.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tang;
    }
}
