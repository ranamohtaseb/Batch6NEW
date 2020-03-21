package com.syntax.class14;

public class Car {

	// define features of the car
	String make;
	String model;
	int year;
	String color;

	// the features we are stating that are linked to the garage class
	// MUST BE BEFORE THE MAIN METHOD

	// define the behavior
	void drive() {
		System.out.println(make+" can drive");

	}

	void accelerate() {
		System.out.println(make+" can accelerate");
	}

	void makeNoise() {
		System.out.println(make+" make noise");
	}

	void stop() {
		System.out.println(make+" stops");
	}
}
