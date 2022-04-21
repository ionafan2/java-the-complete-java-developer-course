package com.ionafan2.jtcjdc.s6.inheritance;

public class Fish extends Animal {

    private int gils;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int wight, int gils, int eyes, int fins) {

        super(name, 1, 1, size, wight);

        this.gils = gils;
        this.eyes = eyes;
        this.fins = fins;
    }

    public void rest() {
    }

    private void moveMuscles() {
    }

    private void moveBackFin() {
    }

    public void swim(int speed) {
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }
}