package com.relon.designpattern.demo.principles.isp;

/**
 * 1. 如果需要一个公司具备完备的所有职能，那么就只需要分别实现法务部和财务部的各个方法
 * 但是
 * 如果把所有的方法都放到一个Company的接口下，若新的需求需要单独有一个模块来完成法务部的相关职能，那么通常就有两种方式，一是重新增加一个
 * ILawyer的接口，再或者直接让法务部(LawyerDepartment)实现Company接口，但是这两种方法都不可避免的会产生冗余代码
 *
 */
public class CompanyBusiness implements Financial, Lawyer{
    @Override
    public void releaseSalary() {

    }

    @Override
    public void checkAmount() {

    }

    @Override
    public void recordBilling() {

    }

    @Override
    public void genContract() {

    }

    @Override
    public void saveContract() {

    }

    @Override
    public void signContract() {

    }
}
