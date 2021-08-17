package com.relon.designpattern.demo.pattern.prototype;

import java.io.*;

public class BaJie implements Cloneable, Serializable {
    private String name;
    private String address;
    private Tang master;

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

    public Tang getMaster() {
        return master;
    }

    public void setMaster(Tang master) {
        this.master = master;
    }

    @Override
    public String toString() {
        return "BaJie{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", master=" + master.toString() +
                '}';
    }

    @Override
    protected BaJie clone() {
        BaJie baJie = null;
        try {
            baJie = (BaJie) super.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return baJie;
    }

    public BaJie deepCloneMaster() {
        BaJie baJie = null;
        try {
            baJie = (BaJie) super.clone();
            baJie.master = baJie.master.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return baJie;
    }

    /**
     * 基于序列化方式的深拷贝
     * @return
     */
    public BaJie deepCloneSerial() {
        BaJie baJie = null;
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            baJie = (BaJie) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return baJie;
    }

}
