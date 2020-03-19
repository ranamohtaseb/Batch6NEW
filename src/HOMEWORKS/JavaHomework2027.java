package HOMEWORKS;

import java.util.Scanner;

public class JavaHomework2027 {
	public static void main (String[] args) {
	
	Scanner scan=new Scanner (System.in);
	System.out.println("how old are you?");
	int age=scan.nextInt();
	
	if(age>=18) { 
		System.out.println("You are eligible to vote");
	}else if(age<18){
	System.out.println("You are not eligible to vote");
	
	}

}

}
