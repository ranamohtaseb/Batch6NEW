package ExtraTasks;

public class DiplomaHouseMortgage102162020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// ==> Diploma
		boolean diploma = true;
		boolean degree = true;
		int gpa = 2;

		if (diploma) {
			System.out.println("Congratulations");
			if (gpa >= 3.5) {
				System.out.println("You are eligible for scholoship");
			} else {
				System.out.println("you should have studies harder");
			}
		} else {
			System.out.println("get a degre");

		}
		
		System.out.println("______________________________");
		
//==> House Loan
		double morRate = 4.5;
		long housePrice = 210000;

		if (morRate > 4.5) {
			System.out.println("You will not buy a house");

		} else {
			System.out.println("You will buy a house");

			if (housePrice > 200000) {
				System.out.println("You need a loan");
			} else {
				System.out.println("you will buy cash");
			}
		}

		System.out.println("______________________________");

// ==> DMV
		
		
	}
}