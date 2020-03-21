package com.syntax.class14;

public class Dog {

	// define features of the dog
	String bread;
	String color;
	int age;
	String name;

	// the features we are stating that are linked to the number of dogs 
	// MUST BE BEFORE THE MAIN METHOD

	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.bread = "Shih tzu";
		dog1.color = "yellow";
		dog1.name = "Lucky";
		dog1.age = 2;
		
		Dog dog2 = new Dog();
		dog2.bread = "Bulldog";
		dog2.color = "black";
		dog2.name = "Bull";
		dog2.age = 4;

		System.out.println("My dog is of "+dog1.bread+" bread. His name is "+dog1.name+" and he is "+dog1.age+" years old and his color is "+dog1.color
				);
	}
}
