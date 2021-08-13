package com.relon.designpattern.demo.principles.lod;

/**
 * ������
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
        System.out.println(company.getName() + "������" + star.getName() + "ͨ��������ǩ�����Ժ�ͬ");
    }
}
