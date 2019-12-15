package oopIntro;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x;
		Car car = new Car();
		
		car.model = "Honda Accord";
		car.color = "Gray";
		car.doors = 4;
		car.wheels = 4;
		System.out.println(car.model);
//		System.out.println("The car is moving at " + car.speed + "mph");
		car.carStatus();
		
		car.speed = 75;
		
		car.carStatus();


	}

}
