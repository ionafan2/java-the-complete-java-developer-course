package com.ionafan2.jtcjdc.s6.inheritance_challenge;

public class Garage {

    public static void main(String args[]) {

        HondaAccord myCoolCar = new HondaAccord("Red", 101);

        System.out.println("My cool car color is:" + myCoolCar.getColor());
        System.out.println("My cool car go Ludicrous Speed now!");
        myCoolCar.goLudicrousSpeed();
    }
}
