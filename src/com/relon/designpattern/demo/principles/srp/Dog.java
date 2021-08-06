package com.relon.designpattern.demo.principles.srp;
/**
 * @Title:
 * @ClassName: com.relon.designpattern.demo.principles.srp.antirsp.AntiSrp.java
 * @Description: ��һְ��ԭ�������(��Լ�����һЩ)
 * 1. һ��Dog�࣬���а�����ɫ����������࣬���Һ��м򵥵�get��set�������Ȿ������
 * 2. �������������һ��ץ����ķ������ǿ������ǲ�����Щ���ײ��ࣿ
 * @author: relon
 * @date:  2021-08-05 16:46
 * @version V1.0
 */

public class Dog {

    private String color;
    private String name;
    private int age;
    // ����
    private String kind;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    // ���������������Ȼ��Υ����һְ��ģ�Ҳ�����ĵ���˵�ģ����ʵ��൫�����˲����ʵ���
    public void catchMouse() {
        System.out.println(name + "����ץ����......");
    }
}
