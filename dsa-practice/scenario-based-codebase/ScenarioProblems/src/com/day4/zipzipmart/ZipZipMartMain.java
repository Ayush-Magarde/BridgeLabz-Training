package com.day4.zipzipmart;

public class ZipZipMartMain {

    public static void main(String[] args) {

        Transaction[] transactions = {
                new Transaction("2024-09-10", 1200),
                new Transaction("2024-09-08", 500),
                new Transaction("2024-09-10", 800),
                new Transaction("2024-09-07", 1500),
                new Transaction("2024-09-08", 300)
        };

        ZipZipMart sorter = new ZipZipMart();

        System.out.println("Before Sorting:");
        for (Transaction t : transactions)
            System.out.println(t);

        sorter.mergeSort(transactions, 0, transactions.length - 1);

        System.out.println("\nAfter Sorting (by Date, then Amount):");
        for (Transaction t : transactions)
            System.out.println(t);
    }
}
