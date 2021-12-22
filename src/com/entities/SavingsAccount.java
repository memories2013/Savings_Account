package com.entities;

public class SavingsAccount {

	private static double annualInterestRate = 0d;
	private double savingsBalance;
	
	

	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public static void setAnnualInterestRate(double annualInterestRate) {
		SavingsAccount.annualInterestRate = annualInterestRate;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

	// init savings balance amount
	public SavingsAccount(double savingsBalance) {
		super();
		this.savingsBalance = savingsBalance;
	}

	// calculate the interest and add to savings
	public void calculateMonthlyInterest() {
		double interest = savingsBalance * (annualInterestRate / 100) / 12;
		savingsBalance += interest;
		display(interest);
	}
	
	// display interest and account balance
	public void display(double interest) {
		System.out.println(" This account has a monthly interest rate of " + interest);
		System.out.println(" The new balance of this account is now $" + savingsBalance);
	}
	
	// modify interest rate
	public static void modifyInterestRate(double newInterestRate) {
		annualInterestRate = newInterestRate;
	}

}