package com.account;

public class Account {
	
	int acctId;
	String acctType;
	double acctBalance;
	
	public Account(int acctId,String acctType,double acctBalance){
		this.acctId=acctId;
		this.acctType=acctType;
		this.acctBalance=acctBalance;
	}
	
	public void deposit(int amount) {
		acctBalance=acctBalance+amount;
	}
	
	public void withdraw(int amount) {
		if(amount<acctBalance)
			acctBalance=acctBalance-amount;
		else
			System.out.println("Insufficient balance");
	}
	
	public void getBalance() {
		System.out.println("Balance is "+acctBalance);
	}
	
	public void display() {
		System.out.println("Account Id is "+acctId+" Account type is "+acctType+" Account balance is "+acctBalance);
	}
	

}
