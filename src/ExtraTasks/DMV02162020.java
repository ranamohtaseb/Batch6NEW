package ExtraTasks;

import java.util.Scanner;

public class DMV02162020 {


		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			System.out.println("What is your age?");
			// you are DMV rep
			// ask customer their age. if they are 18 and older, "you can issue drivers
			// otherwise you will offer them to get a learners permit.

			int age=scan.nextInt();
			
			if (age>=18) {
				System.out.println("you can issue drivers licence");
			}else {
				System.out.println(" Please get a learners permit");
			}
			
		}

	}



