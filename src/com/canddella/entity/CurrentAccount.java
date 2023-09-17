package com.canddella.entity;

public class CurrentAccount extends Account {
	private String gstNumber;

	public CurrentAccount(String accountNo, String gstNumber) {
		super(accountNo);//to call the constructor of parent class since CurrentAccount is the child class of Account class
		this.gstNumber = gstNumber;
	}

	public String getGstNumber() {
		return gstNumber;
	}

	public void setGstNumber(String gstNumber) {
		this.gstNumber = gstNumber;
	}

}
