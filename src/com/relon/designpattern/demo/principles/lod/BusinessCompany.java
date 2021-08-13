package com.relon.designpattern.demo.principles.lod;

/**
 * ��ҵ��˾
 */
public class BusinessCompany {

    private String name;

    public BusinessCompany(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void signDirectly(Star star) {
        System.out.println(name + "������" + star.getName() + "ǩ�����Ժ�ͬ");
    }
}
