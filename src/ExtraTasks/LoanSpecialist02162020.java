package ExtraTasks;

import java.util.Scanner;

public class LoanSpecialist02162020 {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("What is the needed loan amount?");

		int loan=scan.nextInt();
		if(loan<200000) {
			System.out.println("Your laon request is accepted");
		}else {
				System.out.println("Your loan request is rejected");
			}		
}
}
