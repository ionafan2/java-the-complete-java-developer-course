package com.ionafan2.jtcjdc.s6.inheritance;

public class Animal {

    private String name;
    private int brain;
    private int body;
    private int size;
    private int wight;

    public Animal(String name, int brain, int body, int size, int wight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.wight = wight;
    }

    public void eat() {
        System.out.println("Animal.eat() called");
    }

    public void move(int speed) {
        System.out.println("Animal.move() called. Animal is mowing at " + speed);
    }

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWight() {
        return wight;
    }
}
