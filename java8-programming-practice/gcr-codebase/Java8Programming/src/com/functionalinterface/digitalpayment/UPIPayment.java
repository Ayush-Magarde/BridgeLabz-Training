package com.functionalinterface.digitalpayment;

public class UPIPayment implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Paid INR " + amount + " using UPI");
    }
}
