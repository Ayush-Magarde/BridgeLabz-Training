package com.day2.MyBank;

public interface ITransaction {

	void deposit(double amount);
	void withdraw(double amount);
	double checkBalance();
}
