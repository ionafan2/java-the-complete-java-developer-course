package com.ionafan2.jtcjdc.s6;

public class ComplexNumber {

    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double realNumber, double imaginaryNumber) {
        this.real += realNumber;
        this.imaginary += imaginaryNumber;
    }

    public void add(ComplexNumber complexNumber) {
        this.add(complexNumber.getReal(), complexNumber.getImaginary());
    }

    public void subtract(double realNumber, double imaginaryNumber) {
        this.real -= realNumber;
        this.imaginary -= imaginaryNumber;
    }

    public void subtract(ComplexNumber complexNumber) {
        this.subtract(complexNumber.getReal(), complexNumber.getImaginary());
    }
}
