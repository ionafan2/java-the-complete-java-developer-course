package com.ionafan2.jtcjdc.s6;

public class BankAccountMain {

    public static void main(String[] args) {
        //car(args);
        bankAccount(args);
    }

    public static void car(String[] args) {
        // State is fields
        // Behavior is methods

        // Class a template or blueprint of creating an object

        Car porsche = new Car();
        Car tavria = new Car(); //Ukrainian car Make

        tavria.setColour("Red");

        System.out.println(tavria.getColour());
    }

    public static void bankAccount(String[] args) {
        BankAccount johnsBankAccount = new BankAccount();

        johnsBankAccount.withdraw(11);
        johnsBankAccount.deposit(111);
        johnsBankAccount.withdraw(11);
    }

}
