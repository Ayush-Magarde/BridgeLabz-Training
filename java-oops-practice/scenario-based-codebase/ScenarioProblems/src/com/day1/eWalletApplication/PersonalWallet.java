package com.day1.eWalletApplication;

public class PersonalWallet extends Wallet{

	private static final double REFERRAL_BONUS = 100;
	
	public PersonalWallet(double initialBalance, boolean referralUsed) {
		super(initialBalance);
		if (referralUsed) {
			addBalance(REFERRAL_BONUS);
		}
	}
	
	@Override
	public void transferTo(User receiver, double amount) {
		
		if (deductBalance(amount) ) {
			receiver.getWallet().addBalance(amount);
			
			transactions.add(
					new Transaction("Transfer to " + receiver.getName(), amount));
			
			
			receiver.getWallet().transactions.add(
					new Transaction("Receiced from transfer ", amount));
		}
		
		else {
			System.out.println("Insufficient balance (Personal Wallet)");
		}
		
	}
}
