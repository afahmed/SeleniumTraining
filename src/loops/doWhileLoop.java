package loops;

import java.util.Scanner;

public class doWhileLoop {

	public static void main(String[] args) {
		
		int counter = 10;
		
		do {
			System.out.println(counter);
			counter++;
			
		}while (counter <10);
		
		
		
		
		String password = "password";
		Scanner scan = new Scanner (System.in);
		String userpass = null;
		
		//add to 3 tries
		//if the user inputs incorrect password 3 times
		// end the loop
		int attempCount = 0;
		
		do {
		
			userpass = scan.nextLine();
			
//			if(attempCount == 1) {
//				System.out.println("you have one more try left");
//			}
			
			if(attempCount == 2) {
				System.out.println("reached the max number of attempts!");
				break;
			}
			
			attempCount++;
			
		} while (!password.equalsIgnoreCase(userpass));
		
		System.out.println("end of program!!!!");

	}

}
