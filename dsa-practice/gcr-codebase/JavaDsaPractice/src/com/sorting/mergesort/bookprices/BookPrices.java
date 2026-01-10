package com.sorting.mergesort.bookprices;

public class BookPrices {

    private int[] prices;

    public BookPrices(int[] prices) {
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
