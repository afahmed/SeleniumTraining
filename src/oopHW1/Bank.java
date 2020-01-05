package oopHW1;

public class Bank {
	/**
	 * 	create a class called bank
	 * 	the class should have bank name, customer name, customer balance
	 * 	the Bank class should have the following methods
	 * 		deposit()
	 * 		withdraw()
	 * 		checkBalance()
	 * 
	 * 	use scanner class to get input from the keyboard
	 * 		hint: please refer to doWhileLoo.java class in loops package
	 */
	
	private String bankName;
	private String customerName;
	private double balance;
	
	public Bank(String bankName, String customerName, double balance) {
		
		this.bankName = bankName;
		this.customerName = customerName;
		this.balance = balance;
	}
	
	
	public void deposit(double amount) {
		
//		this.balance = this.balance + amount;
		this.balance += amount;
	}
	
	public void withdraw(double amount) {
		
		if(this.balance - amount < 0) {
			System.out.println("$"+amount + " exceeds your available fund of $" + this.balance);
		} else {
			this.balance -= amount;
			System.out.println("amount withdrawn $" + amount + ": avaialbe balance: $" + this.balance);
		}
	}
	
	public void checkBalance() {
		System.out.println("Your balance is: " + this.balance);
	}
	
	
	// getters
	public String getBankName() {
		return this.bankName;
	}
	
	public String getCustomerName() {
		return this.bankName;
	}
	
	public double getBalance() {
		return this.balance;
	}

}
