package HOMEWORKS;

import java.util.Scanner;

public class JavaHomework2022 {
public static void main(String[] args) {
	//Write a program to take user name, age and mobile number

	//First Output: "Enter your name"
	//Second Output: "Enter your mobile number" (please use xxx-xxx-xxxx format)
	//Third Output: "Enter your age"

	//Example Output: 
	//Enter your name
	//Enter your mobile number
	//Enter your age
	//Your name is Weqas, your age is 45 and your mobile number is 571-339-9999	
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter your name");
	String name=scan.nextLine();
	
	
	
	System.out.println("Enter your mobile number");
	String number=scan.nextLine();
	
	System.out.println("Enter your age");
	int age=scan.nextInt();

	System.out.println("Your name is "+ name+ ", your age is "+age+" and your mobile number is "+number);
 
 

	
}
}
