package ExtraTasks;

import java.util.Scanner;

public class CityTemp02162020 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter City");
		
String city=scan.nextLine();
System.out.println("What is the temperature?");
int temp=scan.nextInt();
int celcius=((temp-32)*5/9);
System.out.println("The temperature in the city "+city+" is "+celcius);		
	}
}
