package com.day7.flashdealz;

public class FlashDealzMain {

    public static void main(String[] args) {

        Product[] products = {
                new Product("Shoes", 40),
                new Product("Watch", 60),
                new Product("Phone", 30),
                new Product("Laptop", 50)
        };

        FlashDealz fd = new FlashDealz();
        fd.quickSort(products, 0, products.length - 1);

        System.out.println("Top Discounted Products:");
        for (Product p : products)
            System.out.println(p);
    }
}
