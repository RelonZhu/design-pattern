package com.relon.designpattern.demo.pattern.abstract_factory;

/**
 * ����������һ�Ҽӹ���������Դ��ӹ�С�׵ĸ��ֲ�Ʒ��Ҳ���Դ�����Ϊ�Ĳ�Ʒ���ٶ����Դ����ֻ���ƽ�壬��ô�Ϳ�����������
 */
public interface OemFactory {
    /**
     * �����ֻ�
     */
    MobilePhone produceMobile();
    /**
     * ����ƽ��
     */
    Tablet produceTablet();
}
