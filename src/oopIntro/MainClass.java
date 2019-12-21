package oopIntro;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		int x;
//		// instantiation
//		Car car = new Car();
//		
////		car.model = "Honda Accord";
////		car.color = "Gray";
////		car.doors = 4;
//		car.setDoors(2);
////		car.wheels = 4;
////		System.out.println(car.model);
////		System.out.println(car.doors);
////		System.out.println("The car is moving at " + car.speed + "mph");
//		car.carStatus();
//		
//		car.setColor("Gray");
//		
////		car.speed = 75;
//		
//		car.carStatus();
//		
//		System.out.println("The car has " + car.getDoors() + " doors");
//		
//		Car car2 = new Car();
//		
//		car2.setDoors(4);
//		System.out.println("The car2 has " + car2.getDoors() + " doors");
//		
//		// set the color for car2
//		car2.setColor("Black");
//		
//		// print the value of color in car2
//		System.out.println(car2.getColor());
//		
//		// set the car model
//		
//		
//		// print out the model to the console
		
		
		// constructors
		
		Car honda = new Car(4, 4, "Black", "Accord", 0);
		Car toyota = new Car(2, 4, "White", "Camry", 0);
		
//		System.out.println(honda.getModel());
		
//		honda.setModel("Civic");
		System.out.println(honda.getModel());
		System.out.println(toyota.getModel());
		
		
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


	}

}
