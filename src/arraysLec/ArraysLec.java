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
		
		String[] students = {"Ali", "Suman", "Suman", "Shuriey", "Ahmed"};
		
		System.out.println(students[0]);
		System.out.println(students[1]);
		System.out.println(students[2]);
		System.out.println(students[3]);
		
		for(int i = 0; i < 4; i++) {
			System.out.println(students[i]);
		}
		
		int[] numbers = {1, 2, 3, 4, 5};
	}

}
