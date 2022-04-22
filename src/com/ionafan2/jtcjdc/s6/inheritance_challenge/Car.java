package com.ionafan2.jtcjdc.s6.inheritance_challenge;

public class Car extends Vehicle {

    private String model;
    private int wheels;

    public Car(String color, int licensePlate, int wheels, String make, String model) {
        super(color, licensePlate, make);
        this.model = model;
        this.wheels = wheels;
    }

    public String getModel() {
        return model;
    }

    public int getWheels() {
        return wheels;
    }

    public void changeGear(int gear) {

        System.out.println("Car.changeGear() was changed to " + gear);
        setSpeed(gear * 10);
        super.move();
    }
}
