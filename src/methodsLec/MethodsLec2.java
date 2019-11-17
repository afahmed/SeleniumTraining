package methodsLec;

public class MethodsLec2 {

	public static void main(String[] args) {
		
		// call the method
		greetings("Ali");

		greetings("Ahmed");
	}
	
	// lets write a method that prints hello world
	public static void greetings(String name) {
		
		
		// method body
		System.out.println("Hello " + name);
	}


}
