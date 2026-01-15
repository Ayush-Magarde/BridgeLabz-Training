package com.day9.payxpress;

import java.time.LocalDate;

public class PayXpressMain {

    public static void main(String[] args) {

        Bill electricity = new ElectricityBill(1200, LocalDate.now().plusDays(5));
        Bill water = new WaterBill(450, LocalDate.now().plusDays(3));
        Bill internet = new InternetBill(999, LocalDate.now().plusDays(1));

        electricity.displayBillDetails();
        electricity.sendReminder();
        electricity.pay();
        electricity.displayBillDetails();

        System.out.println();

        water.displayBillDetails();
        water.sendReminder();

        System.out.println();

        internet.displayBillDetails();
        internet.sendReminder();
    }
}
