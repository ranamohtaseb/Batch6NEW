package HOMEWORKS;
import java.util.Scanner;
public class JavaHomework2025 {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("Dear User, please enter a number!");
		int num=scan.nextInt();
		if (num>0) {
			System.out.println(num +" is positive");
		} else if (num<0) {
			System.out.println(num +" is negative");
		}else if(num==0) {
			System.out.println("Entered number is equal to 0");
		}
		}
	}


