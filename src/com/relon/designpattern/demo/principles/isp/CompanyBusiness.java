package com.relon.designpattern.demo.principles.isp;

/**
 * 1. �����Ҫһ����˾�߱��걸������ְ�ܣ���ô��ֻ��Ҫ�ֱ�ʵ�ַ��񲿺Ͳ��񲿵ĸ�������
 * ����
 * ��������еķ������ŵ�һ��Company�Ľӿ��£����µ�������Ҫ������һ��ģ������ɷ��񲿵����ְ�ܣ���ôͨ���������ַ�ʽ��һ����������һ��
 * ILawyer�Ľӿڣ��ٻ���ֱ���÷���(LawyerDepartment)ʵ��Company�ӿڣ����������ַ��������ɱ���Ļ�����������
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
