package com.relon.designpattern.demo.principles.ocp;

public class OcpTest {
    public static void main(String[] args) {
//        ��չǰ
        IShip ship = new Steamship("NB��ս��");
//        ship.run();
        // ������չ�󡪡������º�����½��
        ship = new AmphibiousShip("NB��ս��PLUS");
        ship.run();

    }
}
