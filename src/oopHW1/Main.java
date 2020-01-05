package oopHW1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		
		Scanner scan = new Scanner(System.in);

		
		// instantiate an object from the Bank class
		Bank joe = new Bank("Bank of America", "Joe", 100.00);
		System.out.println("initial balance for Joe is " + joe.getBalance());
		
//		joe.withdraw(20);
//		
//		joe.checkBalance();
//		
//		joe.deposit(300);
//		joe.checkBalance();
		
		System.out.println("Please enter amount to withdraw");
		double amount = scan.nextDouble();
		joe.withdraw(amount);
		
		
		scan.close();

	}

}
