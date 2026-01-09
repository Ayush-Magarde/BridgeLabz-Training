package com.day6.MediStore;

public class MediStoreMain {

    public static void main(String[] args) {

        Medicine tablet = new Tablet("Paracetamol", 20, "12-2026");
        Medicine syrup = new Syrup("Cough Syrup", 120, "08-2025");
        Medicine injection = new Injection("Insulin", 500, "03-2027");

        tablet.displayMedicine();
        syrup.displayMedicine();
        injection.displayMedicine();

        System.out.println();

        tablet.sell(10);
        syrup.sell(5);        // expired (liquid)
        injection.sell(3);

        System.out.println();

        tablet.displayMedicine();
        injection.displayMedicine();
    }
}

