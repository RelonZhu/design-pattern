package com.relon.designpattern.demo.principles.lsp;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // 1.����Ϊ����ʱ������ʹ��������������Ӱ��ԭ�й���
        invokeMethodOfFather(new Father());
        invokeMethodOfFather(new Son());

        // 2.��������д����ǳ��󷽷����μ�SecondSon��-> ��ôԭ��ϣ�����ø��෽����λ�ô���ĵ���������ķ���
        invokerMethodBOfFather(new Father());
        invokerMethodBOfFather(new SecondSon());

        // 3.������ڵ�λ���滻Ϊ���಻һ������
        // invokerMethodOfSon(new Father());

        // 4. �������ͨ�����ظ��෽�����Ŵ�����������ͣ�����֮������
        // 4.1 ���Կ������������������õķ�����һ����
        new Father().methodB(new HashMap());
        new Son().methodB(new HashMap());
        // 4.2 ����ͨ��������չ�Ĺ���Ҳ�ܹ��������ã�4.3����֤һ�·����������
        Map map = new HashMap();
        new Son().methodB(map);
        // 4.3 ��֤����������ʹ����������� �μ�methodC()
        HashMap hashMap = new HashMap();
        Father f = new Father();
        f.methodC(hashMap);
        // ���������滻ԭ�򣬳��ָ����λ�ö�������������棬��ô�����������滻Ϊ���£�
        Son son = new Son();
        son.methodC(hashMap);

    }

    /**
     * ���ø��෽��������֤��������λ�ö����滻Ϊ����ʱ����Ӱ��ԭ�з���
     * ǰ�᣺����û����д������ʵ�ֵķ���
     * @param father
     */
    private static void invokeMethodOfFather(Father father) {
        father.methodA();
    }
    /**
     * ���ø��෽��������֤������д�����Ѵ��ڷ����Ĳ�������
     * ǰ�᣺������д������ʵ�ֵķ���
     * @param f
     */
    public static void invokerMethodBOfFather(Father f) {
        f.methodA();
    }

    /**
     * ���ø��෽��������֤������д�����Ѵ��ڷ����Ĳ�������
     * ǰ�᣺������д������ʵ�ֵķ���
     * @param f
     */
    public static void invokerMethodOfSon(Son f) {
        f.methodAA();
    }
}
