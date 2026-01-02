package com.encapsulation.bankingSystem;

public class SavingsAccount extends BankAccount implements Loanable {

	private static final double interest = 0.04; // 4%
	
    public SavingsAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }
    
    @Override
    public double calculateInterest() {
        return getBalance() * interest;
    }
    
    @Override
    public void applyForLoan(double amount) {
        System.out.println("Savings Account loan applied: INR " + amount);
    }
    
    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 5; // simple rule
    }
}
