package Exception;

import java.util.Scanner;

class NegativeIntegerException extends Exception {

	public NegativeIntegerException(String str) {

		//super(str);
		System.out.println("Withdraw amount should be greater than Zero / Non -ve amount");

	}
}

class InsufficientFundException extends Exception {

	public InsufficientFundException() {

		System.out.println("Insufficient Fund");
	}
}

class Account {

	private int balance = 0;

	// Account object should be created with zero initial balance
	public Account() 
	{
	
	}
	// "Account object should be created with the given balance using parameterized constructor";
	public Account(int balance)  //inserting balance amount into account
	{
		this.balance = balance;
		System.out.println("Your current balance is : " + this.balance);
	}

	// Deposit money in Account
	public void setAccountBalance(int submit) throws NegativeIntegerException  //deposit/credit amount to user account
	{
		if(submit > 0)
		{
		this.balance += submit; //balance = balance + submit ; 
		}
		else
		{
		throw new NegativeIntegerException("Deposite amount should be greater than Zero / Non -ve amount");
		}
	
	}

	// get available Balance

	public int getAccountBalance()  //balance enquiry / balance status
	{
		return this.balance;
	}

	// Withdraw Money
	public int withdraw(int withdrawableAmount) throws NegativeIntegerException, InsufficientFundException {

		// checking withdrawable amount is -ve or not

		if (withdrawableAmount < 0) {
			throw new NegativeIntegerException("Withdraw amount should be greater than Zero / Non -ve amount");
		}
		// checking withdrawable amount is greater than available balance
		if (withdrawableAmount > this.balance) {
			throw new InsufficientFundException();
		}
		// checking withdrawable amount is less than available balance


		if (withdrawableAmount < this.balance) {

			int newBalence = this.balance - withdrawableAmount;
			System.out.println("Your current balance is : " +newBalence);
			return newBalence;
		}

		return this.balance;
	}
	//System.out.println("Your current balance is : " +balance);
}
	public class CustomExceptionEx2 {
	public static void main(String[] args) throws NegativeIntegerException, InsufficientFundException {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your current balance : ");
		int bal = scan.nextInt();
		// Create Account instance
		Account Rohith = new Account(bal);
		
		// deposit amount
		System.out.println("Enter amount to Deposit : ");
		int deposit = scan.nextInt();
		Rohith.setAccountBalance(deposit);
		// withdraw amount
		System.out.println("Enter Your withdrawable Amount");
		int withdrawAmount = scan.nextInt();
		Rohith.withdraw(withdrawAmount);
	}

}

