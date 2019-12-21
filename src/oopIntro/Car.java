package oopIntro;

public class Car { // start of class
	
	// variables and/or methods
	// encapsulation 
	// access modifiers => public private protected
	// read ahead about getters and constructors
	private int doors;
	private int wheels;
	private String color;
	private String model;
	private int speed = 0;
	
	
	
	public Car(int doors, int wheels, String color, String model, int speed) {
		
		this.doors = doors;
		this.wheels = wheels;
		this.color = color;
		this.model = model;
		this.speed = speed;
		
//		System.out.println("constructor called!!!");
	}

	public void carStatus() {
//		int speed = 0;
		if(speed == 0) {
			System.out.println("The car is not moving");
		} else if(speed > 0) {
			System.out.println("The car is moving at " + speed + "mph");
		}
	}
	
	// getters and setters
	// setters
	public void setDoors(int numberOfDoors) {
		// logic
		doors = numberOfDoors;
	}
	
	public void setWheels(int numberOfWheels) {
		wheels = numberOfWheels;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	//getters
	
	public int getDoors() {
		return doors;
	}
	
	public int getWheels() {
		return this.wheels;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getSpeed() {
		return speed;
	}
	

} // end of class
