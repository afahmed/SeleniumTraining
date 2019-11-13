package methodsLec;

public class IntroMethods { // start of the class

	public static void main(String[] args) { //main method begins
		// TODO Auto-generated method stub
		
		// call our method
		greeting("Ahmed");
		greeting("Shuriye");
		greeting("Suman");
		
		printStudentNames("Ali", "Suman", "Shuriye");
		
		addNumbers(4,8);

	} //main method ends
	
	
	// lets write a method that will take two whole numbers and add them,
	// print the result to the screen
	//modify this method such way that, the output(console print) should be like 
	// 5 added to 2 equal 7 i.e if 5, 2 were passed to the method
	public static void addNumbers(int num1, int num2) {
		
		int result = num1 + num2;
		
		System.out.println(result);
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
