package com.ionafan2.jtcjdc.s6.inheritance;

public class Inheritance {

    public static void main(String[] args) {

        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog puddle = new Dog("Puddle", 8, 20, 2, 4, 1, 20, "short");

        puddle.eat();
        puddle.walk();
        puddle.run();
    }
}
