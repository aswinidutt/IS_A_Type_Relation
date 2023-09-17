package com.canddella.entity;

public class SavingsAccount extends Account {
	private String rateOfInterest;

	public SavingsAccount(String accountNo, String rateOfInterest) {//generation of  constructor
		super(accountNo);//to call the constructor of parent class
		this.rateOfInterest = rateOfInterest;
	}

	public String getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(String rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

}
