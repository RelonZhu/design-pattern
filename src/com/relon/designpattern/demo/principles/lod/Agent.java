package com.relon.designpattern.demo.principles.lod;

/**
 * 经纪人
 */
public class Agent {
    private Star star;

    private BusinessCompany company;

    public Star getStar() {
        return star;
    }

    public void setStar(Star star) {
        this.star = star;
    }

    public BusinessCompany getCompany() {
        return company;
    }

    public void setCompany(BusinessCompany company) {
        this.company = company;
    }

    public void signByAgent() {
        System.out.println(company.getName() + "与明星" + star.getName() + "通过经纪人签订代言合同");
    }
}
