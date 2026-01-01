package com.inheritance.hierarchicalInheritance.bankAccountTypes;

public class Main {

    public static void main(String[] args) {

        BankAccount acc1 =
            new SavingsAccount("SA101", 50000, 4.5);

        BankAccount acc2 =
            new CheckingAccount("CA201", 30000, 10000);

        BankAccount acc3 =
            new FixedDepositAccount("FD301", 100000, 24);

        BankAccount[] accounts = { acc1, acc2, acc3 };

        for (BankAccount acc : accounts) {
            acc.displayDetails();

            if (acc instanceof SavingsAccount) {
                ((SavingsAccount) acc).displayAccountType();
            } else if (acc instanceof CheckingAccount) {
                ((CheckingAccount) acc).displayAccountType();
            } else if (acc instanceof FixedDepositAccount) {
                ((FixedDepositAccount) acc).displayAccountType();
            }

            System.out.println();
        }
    }
}
