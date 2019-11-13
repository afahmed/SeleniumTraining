package conditionalStatement;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// lets write to code to 
		// if student receives A print excellent!
		// if student receives B print good job!
		// if student receives C print average
		// if student receives D print approaching
		// if student receives F print try again next time
		
		// create a variable to hold the grade letter
		// use example 'A'
		
		char grade;
		grade = 'C';
		
		switch(grade) {
		
		case 'A':
			System.out.println("Excellent!");
			break;
		case 'B':
			System.out.println("good job!");
			break;
		case 'C':
			System.out.println("Average job");
			break;
		case 'D':
			System.out.println("Approaching");
			break;
		case 'F':
			System.out.println("Try again next time");
			break;
			default:
				System.out.println("unknown grade letter");
			

		}

	}

}
