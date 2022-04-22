package com.ionafan2.jtcjdc.s6.inheritance_challenge;

public class Vehicle {

    private int speed;
    private int licensePlate;
    private String color;
    private String make;

    public Vehicle(String color, int licensePlate, String make) {
        this.color = color;
        this.licensePlate = licensePlate;
        this.make = make;
        this.speed = 0;
    }

    public int getLicensePlate() {
        return licensePlate;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public String getMake() {
        return make;
    }

    public void steer(String direction) {
        System.out.println("Car.steer() to " + direction);
    }

    public int getSpeed() {
        return speed;
    }

    public void move() {
        System.out.println("Vehicle.speed() now is " + speed);
    }
}
