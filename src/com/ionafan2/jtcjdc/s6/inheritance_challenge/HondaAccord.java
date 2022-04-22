package com.ionafan2.jtcjdc.s6.inheritance_challenge;

public class HondaAccord extends Car {

    public HondaAccord(String color, int licensePlate) {
        super(color, licensePlate, 3, "Honda", "Accord");
    }

    public void goLudicrousSpeed() {
        System.out.println("HondaAccord.goLudicrousSpeed() is enabled!");
        changeGear(100);
        System.out.println("HondaAccord.speed() now is " + getSpeed());
    }

}
