package com.relon.designpattern.demo.principles.ocp;

public class AmphibiousShip extends Steamship{
    public AmphibiousShip(String name) {
        super(name);
    }

    @Override
    public void run() {
        super.run();
        System.out.println(getName() + "ÒÑµÇÂ½¡£¡£¡£¡£");
    }
}
