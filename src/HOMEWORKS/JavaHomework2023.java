package HOMEWORKS;

import java.util.Scanner;

public class JavaHomework2023 {
public static void main(String[] args) {
	
/*Create a program that will ask a user to input boolean value "Input the boolean value"
*If the input is true or false, then the output should look like below: 
*Input the boolean value
*The value is true
+Input the boolean value
*The value is false	
 */
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Input the boolean value");
	
	
	boolean season=scan.nextBoolean();
	if (season==true) {
		System.out.println("The value is true");
	}else if(season==false){
	System.out.println("The value is false");
	};
	
}
}
