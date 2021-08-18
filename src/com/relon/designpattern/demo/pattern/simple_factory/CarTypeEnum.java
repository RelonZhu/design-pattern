package com.relon.designpattern.demo.pattern.simple_factory;

public enum CarTypeEnum {
    AUDI(1, "°ÂµÏ"),
    BENZ(2, "±¼³Û");

    private int code;
    private String desc;

    CarTypeEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
