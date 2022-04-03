package com.ionafan2.jtcjdc.s6;

public class Car {

    // Fields declaration:  Access Modifier -> Type -> Name

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setColour(String colour) {
        String validColor = colour.toLowerCase();

        if (validColor.equals("red") || validColor.equals("white")) {
            this.colour = colour;
        } else {
            this.colour = "unpainted";
        }
    }

    public String getColour() {
        return this.colour;
    }
}
