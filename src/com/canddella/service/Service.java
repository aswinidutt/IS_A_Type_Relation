package com.canddella.service;

import java.util.Scanner;

import com.canddella.entity.Account;
import com.canddella.entity.InstitutionalCurrentAccount;
import com.canddella.entity.PremiumCurrentAccount;
import com.canddella.entity.SavingsMaxAccount;
import com.canddella.entity.WomenSavingsAccount;

public class Service {
public static Account createAccount(int choice) {
	Scanner scanner = new Scanner(System.in);
	Account account=null;
	
	if(choice==1)
	{
		System.out.println("1.Women Saving Account\n 2.Savings Max Account\n");
	System.out.println("Enter your selection");
	int selection= scanner.nextInt();
	
	if(selection==1)
	
	{
account= new WomenSavingsAccount("SA100","5%",5000);
	}
	
	else if(selection==2)	
	{
		account= new SavingsMaxAccount("SA100","5%",6000);
	}
	
	}
	else if (choice ==2)
	{
	
		System.out.println("1.Institutional Current Account\n 2.Premium Current Account\n");
	System.out.println("Enter your selection");
	int selection= scanner.nextInt();
	

	if(selection==1)
	
	{
	account=new InstitutionalCurrentAccount("CA100","5%",50000);//create and return
	}
	
	else if(selection==2)	
		
		account= new PremiumCurrentAccount("CA100","5%",3000);
	
	}
	return account;
}


	public static void dispalyAccountDetails(Account account)// can point to either saving or current acnt

	{
//	SavingsAccount savingsAccount = null;
//		CurrentAccount currentAccount = null;
		WomenSavingsAccount womenSavingsAccount=null;
		SavingsMaxAccount savingsMaxAccount=null;
		PremiumCurrentAccount premiumCurrentAccount=null;
		 InstitutionalCurrentAccount  institutionalCurrentAccount=null;
		 
		 
		if(account instanceof WomenSavingsAccount)
		{
			womenSavingsAccount=(WomenSavingsAccount)account;
			System.out.println(womenSavingsAccount.getAccountNo()+"  "+womenSavingsAccount.getRateOfInterest()+" "+womenSavingsAccount.getCashBack());
		}
		else if(account instanceof SavingsMaxAccount)
		{
			savingsMaxAccount=(SavingsMaxAccount)account;
			System.out.println(savingsMaxAccount.getAccountNo()+"   "+savingsMaxAccount.getRateOfInterest()+"  "+savingsMaxAccount.getWithdrawLimit());
		}
		else if(account instanceof InstitutionalCurrentAccount)
		{
			institutionalCurrentAccount=(InstitutionalCurrentAccount)account;
			System.out.println(institutionalCurrentAccount.getAccountNo()+"  "+institutionalCurrentAccount.getGstNumber()+" "+institutionalCurrentAccount.getTransactionLimit());
		}
		else if(account instanceof  PremiumCurrentAccount)
		{
			premiumCurrentAccount=(PremiumCurrentAccount)account;
			System.out.println(premiumCurrentAccount.getAccountNo()+"  "+premiumCurrentAccount.getGstNumber()+" "+premiumCurrentAccount.getBonusLimit());
		}



	}
}