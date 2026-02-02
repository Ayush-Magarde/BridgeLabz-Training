package com.functionalinterface.digitalpayment;

public class WalletPayment implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Paid INR " + amount + " using Wallet");
    }
}
