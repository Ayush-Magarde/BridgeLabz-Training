package com.stacksandqueues.StockSpanProblem;

public class StockSpanMain {

    public static void main(String[] args) {

        int[] prices = {100, 80, 60, 70, 60, 75, 85};

        int[] span = StockSpan.calculateSpan(prices);

        System.out.println("Day | Price | Span");
        System.out.println("-------------------");

        for (int i = 0; i < prices.length; i++) {
            System.out.println(
                    (i + 1) + "   | " +
                    prices[i] + "   | " +
                    span[i]
            );
        }
    }
}
