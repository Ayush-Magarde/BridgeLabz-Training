package com.day3.smartcheckout;

import java.util.*;

public class SmartCheckout {

    private Queue<Customer> queue = new LinkedList<>();
    private HashMap<String, Integer> priceMap = new HashMap<>();
    private HashMap<String, Integer> stockMap = new HashMap<>();

    public SmartCheckout() {
        priceMap.put("Milk", 50);
        priceMap.put("Bread", 40);
        priceMap.put("Eggs", 10);

        stockMap.put("Milk", 10);
        stockMap.put("Bread", 8);
        stockMap.put("Eggs", 30);
    }

    public void addCustomer(Customer c) {
        queue.add(c);
        System.out.println("Customer added: " + c.name);
    }

    public void processCustomer() {
        if (queue.isEmpty()) {
            System.out.println("No customers in queue.");
            return;
        }

        Customer c = queue.poll();
        int total = 0;

        for (String item : c.items) {
            if (stockMap.get(item) > 0) {
                total += priceMap.get(item);
                stockMap.put(item, stockMap.get(item) - 1);
            }
        }

        System.out.println("Billing " + c.name + " | Total: INR " + total);
    }
}
