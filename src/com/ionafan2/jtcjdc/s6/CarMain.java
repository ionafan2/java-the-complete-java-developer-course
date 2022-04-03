package com.ionafan2.jtcjdc.s6;

public class CarMain {

    public static void main(String[] args) {
        // State is fields
        // Behavior is methods

        // Class a template or blueprint of creating an object

        Car porsche = new Car();
        Car tavria = new Car(); //Ukrainian car Make

        tavria.setColour("Red");

        System.out.println(tavria.getColour());
    }
}
