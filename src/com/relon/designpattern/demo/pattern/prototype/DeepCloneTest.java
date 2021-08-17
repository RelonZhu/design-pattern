package com.relon.designpattern.demo.pattern.prototype;

public class DeepCloneTest {
    public static void main(String[] args) {
        // ���ݳ�ʼ��
        BaJie baJie = new BaJie();
        Tang master = new Tang();
        baJie.setName("��˽�");
        baJie.setAddress("����ׯ");
        master.setName("��ɮ");
        master.setAddress("��������");
        baJie.setMaster(master);
        // ǳ����������������
        BaJie newBaJie = baJie.clone();
        System.out.println("�˽�����" + baJie);
        System.out.println("�˽����" + newBaJie);
        System.out.println("�˽����ͻ����Ƿ�Ϊһ��ʦ����" + (baJie.getMaster() == newBaJie.getMaster()));
        // �����(����Ӱ����)ʦ�����ԡ�����ʦ��Ҳ���Ż���
        BaJie baJie1 = baJie.deepCloneMaster();
        System.out.println("����Ӱ����" + baJie1);
        System.out.println("����Ӱ����֮���Ƿ���ͬһ��ʦ����" + (baJie.getMaster() == baJie1.getMaster()));
        // �߽׶���Ӱ����(�ܺõ�Ӧ�Զ������ж�������������Ե����)
        BaJie baJie2 = baJie.deepCloneSerial();
        System.out.println("�߽׶���Ӱ����" + baJie2);
        System.out.println("�߽׶���Ӱ����֮���Ƿ���ͬһ��ʦ����" + (baJie.getMaster() == baJie1.getMaster()));
    }
}
