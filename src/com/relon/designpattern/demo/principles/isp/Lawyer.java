package com.relon.designpattern.demo.principles.isp;

/**
 * @description: 法务部:具有合同出具、合同留存、合同签署功能
 * @author: relon
 */
public interface Lawyer {

    void genContract();

    void saveContract();

    void signContract();
}
