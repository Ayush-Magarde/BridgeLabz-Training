package com.day3.smartcheckout;

import java.util.Arrays;

public class SmartCheckoutMain {

    public static void main(String[] args) {

        SmartCheckout checkout = new SmartCheckout();

        Customer c1 = new Customer("Ayush", Arrays.asList("Milk", "Bread"));
        Customer c2 = new Customer("Aarya", Arrays.asList("Eggs", "Milk"));

        checkout.addCustomer(c1);
        checkout.addCustomer(c2);

        checkout.processCustomer();
        checkout.processCustomer();
    }
}
