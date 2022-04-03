package com.ionafan2.jtcjdc.s6;

public class VipCustomerMain {
    public static void main(String[] args) {

        VipCustomer vipPerson = new VipCustomer();

        System.out.println(vipPerson.getName());
        System.out.println(vipPerson.getCreditLimit());
        System.out.println(vipPerson.getEmailAddress());

        VipCustomer vipPerson2 = new VipCustomer("Bob", 25000.0);

        System.out.println(vipPerson2.getName());
        System.out.println(vipPerson2.getCreditLimit());
        System.out.println(vipPerson2.getEmailAddress());

        VipCustomer vipPerson3 = new VipCustomer("Tarpit", 1000.0, "testmail@mail.com");

        System.out.println(vipPerson3.getName());
        System.out.println(vipPerson3.getCreditLimit());
        System.out.println(vipPerson3.getEmailAddress());
    }
}
