package com.canddella.entity;

public class PremiumCurrentAccount extends CurrentAccount {
	private double bonusLimit;
	public PremiumCurrentAccount(String accountNo, String gstNumber,double bonusLimit) {
		super(accountNo, gstNumber);
		this.bonusLimit = bonusLimit;
	
	}
	public double getBonusLimit() {
		return bonusLimit;
	}
	public void setBonusLimit(double bonusLimit) {
		this.bonusLimit = bonusLimit;
	}
	

	
	

}
