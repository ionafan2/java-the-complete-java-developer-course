package com.ionafan2.jtcjdc.s6;

public class BankAccount {

    private long number;
    private double balance;

    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    public BankAccount(long number, double balance, String customerName, String customerEmail, String customerPhoneNumber) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public BankAccount(long number, double balance, String customerName, String customerEmail) {
        // constructors by chain... and looks like it's quite possible
        this(number, balance, customerName, customerEmail, "+12345233445");
    }

    public BankAccount() {
        // testing if I can call constructors by chain...
        this(1458568594, 0.0, "John Smith", "JohnSmith@mail.com");
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Only positive amount is allowed!");
            return;
        }

        this.balance += amount;

        System.out.println("Amount of " + amount + " was successfully deposited to your account.");
        System.out.println("Current balance is: " + this.balance);
    }

    public void withdraw(double amount) {
        if (this.balance < amount) {
            System.out.println("Requested amount can't be withdrawn! Insufficient account balance!");
            return;
        }

        this.balance -= amount;

        System.out.println("Amount of " + amount + " was successfully withdrawn from your account.");
        System.out.println("Current balance is: " + this.balance);
    }
}
