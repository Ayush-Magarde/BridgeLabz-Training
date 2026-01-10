package com.sorting.quicksort.productprices;

public class Main {

    public static void main(String[] args) {

        int[] priceArray = {1200, 450, 999, 300, 750};

        ProductPrices productPrices = new ProductPrices(priceArray);

        System.out.println("Before Sorting:");
        productPrices.displayPrices();

        QuickSort.sort(productPrices.getPrices(), 0, priceArray.length - 1);

        System.out.println("After Sorting:");
        productPrices.displayPrices();
    }
}
