package com.relon.designpattern.demo.principles.isp;

/**
 * @description: 财务部：具有薪资发放、财务核算、入账等职能
 * @author：relon
 */
public interface Financial {
    // 工资发放
    void releaseSalary();

    // 对账
    void checkAmount();

    // 入账
    void recordBilling();
}
