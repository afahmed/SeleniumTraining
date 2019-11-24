package methodsLec;

public class IntroMethods { // start of the class

	public static void main(String[] args) { //main method begins
		// TODO Auto-generated method stub
		
		// call our method
		greeting("Ahmed");
		greeting("Shuriye");
		greeting("Suman");
		
		printStudentNames("Ali", "Suman", "Shuriye");
		
		
		// method call
		addNumbers(4,8);
		
		// method call
		double operationResult = mathOperation(2, 3, '-');
		System.out.println("The result is " + operationResult);
		
		operationResult = mathOperation(5,10, '+');
		System.out.println("The result is " + operationResult);
		
		operationResult = mathOperation(5,10, 'u');
		System.out.println("The result is " + operationResult);

	} //main method ends
	
	// lets write a method that takes three parameters
	// it will to operands and one operators and perform operation given 
	// the operator
	// return the result
	
	public static double mathOperation(double num1, double num2, char operator) {
		
		double result = 0;
		if(operator == '+') {
			result = num1 + num2;
		} else if(operator == '-') {
			result = num1 - num2;
		} else if(operator == '*') {
			//body
			result = num1 * num2;
		} else if(operator == '/') {
			result = num1 / num2;
		} else {
			System.out.println("unknown math operator");
		}
		
		
		return result;
	}
	
	
	// lets write a method that will take two whole numbers and add them,
	// print the result to the screen
	//modify this method such way that, the output(console print) should be like 
	// 5 added to 2 equal 7 i.e if 5, 2 were passed to the method
	public static void addNumbers(int num1, int num2) {
		
		int result = num1 + num2;
		
		System.out.println(num1 + " added to " + num2 + " equals to " +  result);
	}
	
	
	//declare a method
	public static void greeting(String name) {
		
		System.out.println("Hello World " + name);
	}
	
	// write a method that takes all students (3) names as an argument
	// print it on the console
	// hint: multiple arguments are separated by a commas
	
	public static void printStudentNames(String name1, String name2, String name3) {
		
		System.out.println("students: " + name1 + " " + name2 + " " + name3);
		
	}
	

} // end of the class
