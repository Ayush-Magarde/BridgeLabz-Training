package com.day9.tailorshop;

public class TailorShopMain {

    public static void main(String[] args) {

        TailorShop shop = new TailorShop(10);

        shop.addOrder(new Order("ORD101", 5));
        shop.addOrder(new Order("ORD102", 2));
        shop.addOrder(new Order("ORD103", 7));
        shop.addOrder(new Order("ORD104", 1));

        System.out.println("Orders sorted by delivery deadline:");
        shop.displayOrders();
    }
}
