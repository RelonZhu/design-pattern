package com.relon.designpattern.demo.principles.ocp;

public class OcpTest {
    public static void main(String[] args) {
//        拓展前
        IShip ship = new Steamship("NB号战舰");
//        ship.run();
        // 功能拓展后——可以下海可以陆地
        ship = new AmphibiousShip("NB号战舰PLUS");
        ship.run();

    }
}
