package oopIntro;

public class Car {
	
	// variables and/or methods
	
	int doors;
	int wheels;
	String color;
	String model;
	int speed = 0;

	public void carStatus() {
//		int speed = 0;
		if(speed == 0) {
			System.out.println("The car is not moving");
		} else if(speed > 0) {
			System.out.println("The car is moving at " + speed + "mph");
		}
	}

}
