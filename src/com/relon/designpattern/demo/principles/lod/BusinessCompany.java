package com.relon.designpattern.demo.principles.lod;

/**
 * 商业公司
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
        System.out.println(name + "与明星" + star.getName() + "签订代言合同");
    }
}
