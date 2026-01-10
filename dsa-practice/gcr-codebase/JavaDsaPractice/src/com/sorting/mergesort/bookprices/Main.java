package com.sorting.mergesort.bookprices;

public class Main {

    public static void main(String[] args) {

        int[] priceArray = {499, 299, 899, 199, 649};

        BookPrices bookPrices = new BookPrices(priceArray);

        System.out.println("Before Sorting:");
        bookPrices.displayPrices();

        MergeSort.sort(bookPrices.getPrices(), 0, priceArray.length - 1);

        System.out.println("After Sorting:");
        bookPrices.displayPrices();
    }
}
