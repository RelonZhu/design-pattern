package com.relon.designpattern.demo.principles.dip;

public class Main {
    public static void main(String[] args) {
        // ����ֻ�ܹ���ʻ�µϣ���Ȼ��̫�������ǿ��Ա����������
        MaleDriver audiDriver = new MaleDriver();
        audiDriver.drive();

        // �Ľ���ͼȿ��Լ�ʻ�µ��ֿ��Լ�ʻ����
        MaleDriver allDriver = new MaleDriver();
        allDriver.driveNew(new Audi());
        allDriver.driveNew(new BMW());
        // ������Ȼ�Ƚ����������ǻ���һ���������MaleDriver allDriver = new MaleDriver();��ζ�Ž������Լ�ʻԱ���ѵ�Ů�ԾͲ�������
        // ���Կ������������塪���������ı�����������ǽӿڻ������
        IDriver driver = new MaleDriver();
        //      ����driver�����ͽ�������ʵ�ʵļ�ʻԱ���������Ķ���
    }
}
