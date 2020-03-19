package ExtraTasks;

public class Grades02222020 {

	public static void main(String[] args) {
		// Write a program that will read three inputs of scores
		//(quiz, mid term, and final scores) and determine the grade based on the following rules:
		//if the average score >=90 → grade=A
		//if the average score >= 70 and <90 → grade=B
		//if the average score>=50 and <70 → grade=C
		//if the average score<50 → grade=F2.
		//Write a program for user to enter his/hers birth month. 
		// Based on the month define the season.
		//Example: if user is born in June, July or August →season =”Summer”.
		//At the end of the program we should see output as “You were born ______”.
		
int score=71;
if(score>=90) {
	System.out.println("Grade is A");
}else if (score<90 && score >=70) {
	System.out.println("Grade is B");
}else if (score<70 && score >=50) {
	System.out.println("Grade is C");
}else {
	System.out.println("Grade is F");
}
	}

}
