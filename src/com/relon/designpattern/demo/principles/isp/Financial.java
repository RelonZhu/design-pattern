package com.relon.designpattern.demo.principles.isp;

/**
 * @description: ���񲿣�����н�ʷ��š�������㡢���˵�ְ��
 * @author��relon
 */
public interface Financial {
    // ���ʷ���
    void releaseSalary();

    // ����
    void checkAmount();

    // ����
    void recordBilling();
}
