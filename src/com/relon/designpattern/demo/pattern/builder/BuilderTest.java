package com.relon.designpattern.demo.pattern.builder;

public class BuilderTest {
    public static void main(String[] args) {
        Builder builder = new AssemblingBuilder();
        Director director = new Director(builder);
        Computer computer = director.buildComputer("Intel ���i9 7900X", "�߲ʺ� GTX 3060Ti",
                "����AORUS Z270X-Gaming 7", "�Ƹ�Cras II ��� 16GB DDR4 3000", "Ӣ�ض� I350T4");
        System.out.println(computer.toString());
    }
}
