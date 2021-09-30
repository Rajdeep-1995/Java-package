package com.account.test;
import java.util.Scanner;

import com.account.*;

public class AccountMain {

	public static void main(String[] args) {
		
		int depositAmt,withdrwaAmt,key;
		
		Account ac = new Account(123,"Saving",10000);
		
		Scanner s = new Scanner(System.in);
	
		
		do {
		
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		System.out.println("3. Display Balance");
		System.out.println("4. Exit");
		key = s.nextInt();
		
		if(key==1) {
			System.out.println("Enter amount to deposit");
			depositAmt=s.nextInt();
			ac.deposit(depositAmt);
			
		}else if(key==2) {
			System.out.println("Enter withdraw amount");
			withdrwaAmt = s.nextInt();
			ac.withdraw(withdrwaAmt);
			
		}else if(key==3) {
			ac.display();
			
		}else if(key==4) {
			System.out.println("Thank you for banking with us");
		}else {
			System.out.println("Invalid choice");
		}
		
		}while(key!=4);

	}

}
