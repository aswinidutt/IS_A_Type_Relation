package com.canddella.entity;

public class WomenSavingsAccount extends SavingsAccount {
private double cashBack;

public WomenSavingsAccount(String accountNo, String rateOfInterest, double cashBack) {
	super(accountNo, rateOfInterest);
	this.cashBack = cashBack;
}

public double getCashBack() {
	return cashBack;
}

public void setCashBack(double cashBack) {
	this.cashBack = cashBack;
}




	
	}


