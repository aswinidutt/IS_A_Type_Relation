package com.canddella.utility;

import java.util.Scanner;

import com.canddella.entity.Account;
import com.canddella.service.Service;

public class Utility {

	public static void main(String[] args) {
		
		char contChoice='y';
		Account account = null;
		Scanner scanner = new Scanner(System.in);
		do
		{
			System.out.println("The available accounts are:\n");
			System.out.println("1.Savings account\n 2.Current account\n 3.Display account details");
			System.out.println("enter your choice:");
			int choice = scanner.nextInt();	
		
		switch(choice)
		{
		case 1:account=Service.createAccount(choice);//return an account ref variable//case 1 for savings account
		break;
		case 2:account=Service.createAccount(choice);
		break;
		case 3:Service.dispalyAccountDetails(account);
		break;
		default:break;
			//System.out.println("invalid choice");
			
		}
		
		System.out.println("Do you want to continue:-");
		 contChoice = scanner.next().charAt(0);
		}
		while((contChoice=='y')||(contChoice=='Y'));
	
	}

}	
	
		
		
	

	


