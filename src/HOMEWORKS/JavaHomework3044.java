package HOMEWORKS;

import java.util.Scanner;

public class JavaHomework3044 {

	public static void main(String[] args) {
//Prompt user with questions: "Please enter your favorite car make"
//
//if user enters  BMW -->  carOrigin = "german car"
//if user enters  Toyota -->  carOrigin = " japanese car"
//if user enters  Maserati -->  carOrigin = "italian car"
//anything else besides those values --> carOrigin = "unknown" 
//			 
//aThe output of your program should be:
//a"Your favorite car is ___"

	Scanner scan;
	String carMake;
	String carOrigin;
	
	scan=new Scanner (System.in);
	System.out.println("Please enter your favorite car make");
	carMake=scan.nextLine();
	
	switch (carMake) {
	case "BMW":
		carOrigin="german car";
		break;
	case "Toyota":
		carOrigin="japanese car";
		break;
	case "Maserati":
		carOrigin="italian car";
		break;
	default:
		carOrigin="unknown";
		break;
	}
	System.out.println("Your favorite car is "+carOrigin);
	
	
	}

}
