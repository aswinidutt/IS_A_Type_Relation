package com.canddella.entity;

public class InstitutionalCurrentAccount extends CurrentAccount {

	private double transactionLimit;

	public InstitutionalCurrentAccount(String accountNo, String gstNumber, double transactionLimit) {
		super(accountNo, gstNumber);
		this.transactionLimit = transactionLimit;
	}

	public double getTransactionLimit() {
		return transactionLimit;
	}

	public void setTransactionLimit(double transactionLimit) {
		this.transactionLimit = transactionLimit;
	}
	

}
