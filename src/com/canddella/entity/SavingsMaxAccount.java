package com.canddella.entity;

public class SavingsMaxAccount extends SavingsAccount {
private double withdrawLimit;

public SavingsMaxAccount(String accountNo, String rateOfInterest, double withdrawLimit) {
	super(accountNo, rateOfInterest);
	this.withdrawLimit = withdrawLimit;
}

public double getWithdrawLimit() {
	return withdrawLimit;
}

public void setWithdrawLimit(double withdrawLimit) {
	this.withdrawLimit = withdrawLimit;
}

	
	
}
