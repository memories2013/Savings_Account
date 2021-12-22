package com.entities;

public class SavingsAccount {

	private static double annualInterestRate = 0d;
	private double savingsBalance;

	public SavingsAccount(double savingsBalance) {
		super();
		this.savingsBalance = savingsBalance;
	}

	public void calculateMonthlyInterest() {
		savingsBalance *= (annualInterestRate / 100) / 12;
	}
	
	public void display() {
		System.out.println(" The account has $" + savingsBalance);
	}
	
	public static void modifyInterestRate(double newInterestRate) {
		annualInterestRate = newInterestRate;
	}

}