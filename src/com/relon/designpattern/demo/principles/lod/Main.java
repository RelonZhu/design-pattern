package com.relon.designpattern.demo.principles.lod;

public class Main {
    public static void main(String[] args) {
        BusinessCompany com = new BusinessCompany("����������");
        com.signDirectly(new Star("�����"));
        // ��Ȼ��������Ҳû��ʲô���⣬���Ǵ�ְ��Ƕ������������ǲ�̫����ֱ�����������˵ģ����԰ѷ�������һ�±����������
        Agent agent = new Agent();
        agent.setCompany(new BusinessCompany("����������"));
        agent.setStar(new Star("�����"));
        // ���������˾����Ǻ���ҵ��Դ
        agent.signByAgent();
        /**
         * ��Ϣר��ģʽ�������ǣ�����Ϣ�ĳ����߼�Ϊ��������Ϣ��ר�ҡ���Ҳ����˵Agent�������BusinessCompany��Star������ô�������
         * ������ҲӦ����Agent����
         */

    }
}
