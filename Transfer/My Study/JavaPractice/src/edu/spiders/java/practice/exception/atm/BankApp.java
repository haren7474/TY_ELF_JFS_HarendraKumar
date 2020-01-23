package edu.spiders.java.practice.exception.atm;

public class BankApp {

	public static void main(String[] args) 
	{
		double balAmt=20000;
		double withdrawlAmt= 25000;
		
		BankTransaction bt= new BankTransaction();
		bt.checkBalance(balAmt, withdrawlAmt);
	
	}

}
