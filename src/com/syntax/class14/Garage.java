package com.syntax.class14;

public class Garage {

	public static void main(String[] args) {
	//build individual objects
		
		Car car1 = new Car();
		car1.make = "Lamborgini";
		car1.model = "Gallardo";
		car1.year = 2020;
		car1.color = "Blue";
		
		Car car2 =new Car();
		car2.make = "BMW";
		car2.model = "M5";
		car2.year = 2019;
		car2.color = "White";
		
		Car car3= new Car();
		car3.make="123";
		//car3.speed = 200;CE as speed was not decleared
		
		//print BMW
		System.out.println(car2.make);
		
		
		
	
		//accessing behaior/methods of Car with car1
		car1.drive();
		car1.accelerate();
		car1.makeNoise();
		car1.stop();
		
		//accessing behaior/methods of Car with car2
	car2.drive();
	car2.accelerate();
	car2.makeNoise();
	car2.stop();
	
	//I drive white BMW
	System.out.println("I drive a " + car2.color + " " + car2.make);	

	
	
	}

}
