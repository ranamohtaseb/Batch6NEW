package HOMEWORKS;

import java.util.Scanner;

public class JavaHomework2029 {
  	public static void main(String[] args) {
		
Scanner scan=new Scanner(System.in);
System.out.println("Please enter first number");
int x=scan.nextInt();

System.out.println("Please enter second number");
int y=scan.nextInt();

if((x*y)>0) {
	System.out.println("true");
} else if((x*y)<0) {
	System.out.println("false");
}else {
	System.out.println("Entered numbers equal to zero");
}

}

}



