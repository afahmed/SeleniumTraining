package arraysLec;


public class ArraysLec {
	


	public static void main(String[] args) {
		
		String student1 = "Ali";
		String student2 = "Suman";
		String student3 = "Shuirye";
		String student4 = "Ahmed";
		
		// using array
//		String[] students = new String[4]; //declare
//		
//		//initialize
//		students[0] = "Ali";
//		students[1] = "Suman";
//		students[2] = "Shuriye";
//		students[3] = "Ahmed";
		
		String students[] = {"Ali", "Suman", "Faisal", "Ahmed"};
		
//		System.out.println(students[0]);
//		System.out.println(students[1]);
//		System.out.println(students[2]);
//		System.out.println(students[3]);
		
		for(int i = 0; i < 4; i++) {
			System.out.println(students[i]);
		}
		
		int[] numbers = {1, 2, 3, 6, 7, 9, 10};
		// print numbers using for loop
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		// lets get the length of the array numbers
		
		int arrayLength = numbers.length;
		System.out.println("The length of the numbers array is: " + arrayLength);
		
		
		
		
		
		
		
		
		
	}

}
