package com.sorting.quicksort.productprices;

public class ProductPrices {

    private int[] prices;

    public ProductPrices(int[] prices) {
        this.prices = prices;
    }

    public int[] getPrices() {
        return prices;
    }

    public void displayPrices() {
        for (int price : prices) {
            System.out.print(price + " ");
        }
        System.out.println();
    }
}
