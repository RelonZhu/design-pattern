package com.relon.designpattern.demo.pattern.builder;

public class BuilderTest {
    public static void main(String[] args) {
        Builder builder = new AssemblingBuilder();
        Director director = new Director(builder);
        Computer computer = director.buildComputer("Intel ¿áî£i9 7900X", "Æß²Êºç GTX 3060Ti",
                "¼¼¼ÎAORUS Z270X-Gaming 7", "¿Æ¸³Cras II ºìµÆ 16GB DDR4 3000", "Ó¢ÌØ¶û I350T4");
        System.out.println(computer.toString());
    }
}
