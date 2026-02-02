package com.functionalinterface.paymentgateway;

public class PaymentGatewayMain {

    public static void main(String[] args) {

        PaymentProcessor upi = new UPIPayment();
        PaymentProcessor card = new CardPayment();

        upi.pay(1000);
        upi.refund(200);

        card.pay(2500);
        card.refund(500);
    }
}
