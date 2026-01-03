package com.eWalletApplication;

public class BusinessWallet extends Wallet {
	
	private static final double TAX_RATE = 0.05;  // 5 percent
	
	public BusinessWallet(double initialBalance) {
		super(initialBalance);
	}

	@Override
	public void transferTo(User receiver, double amount) {
		
		double tax = amount * TAX_RATE;
		double totalReduction = amount + tax;
		
		if((deductBalance(totalReduction))) {
			receiver.getWallet().addBalance(amount);
			
			transactions.add(new Transaction (
					"Business transfer (Tax INR " + tax + ") " , amount));
			
			receiver.getWallet().transactions.add(
					new Transaction("Received from business " , amount));
		}
		else {
			System.out.println("Insufficient balance (Business Wallet)");
		}
	}
}
