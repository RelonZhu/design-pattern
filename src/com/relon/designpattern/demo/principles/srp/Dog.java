package com.relon.designpattern.demo.principles.srp;
/**
 * @Title:
 * @ClassName: com.relon.designpattern.demo.principles.srp.antirsp.AntiSrp.java
 * @Description: 单一职责原则的例子(相对极端了一些)
 * 1. 一个Dog类，其中包含颜色、年龄和种类，并且含有简单的get和set方法，这本无问题
 * 2. 如果在其中增加一个抓老鼠的方法，那看起来是不是有些不伦不类？
 * @author: relon
 * @date:  2021-08-05 16:46
 * @version V1.0
 */

public class Dog {

    private String color;
    private String name;
    private int age;
    // 种类
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

    // 这个方法看起来显然是违背单一职责的，也就是文档里说的，合适的类但是做了不合适的事
    public void catchMouse() {
        System.out.println(name + "正在抓老鼠......");
    }
}
