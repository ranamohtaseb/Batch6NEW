package com.syntax.calss04;

public class NestingElseIf {

	public static void main(String[] args) {
		/* if student completed the quiz--> we will check for the score
		 * if score >90 --> great job
		 * if score >80 --> well done
		 * if score >70 --> you could have done better
		 * 
		 * if student did not complete the quiz --> not good
		 * please do homework on time
		 */

		
		boolean quizCompleted=true;
		int score=81;
		
		
		if (quizCompleted) {
			System.out.println("Let's check your score");
			if (score>90) {
				System.out.println("Great job, you studeny a lot");
			}else if (score>80) {
				System.out.println("well done");
			}else if (score >70) {
				System.out.println("you could have done better");
			}else {
				System.out.println(" you have failed");
			}
		}else {
			System.out.println("Please do HW on time");
		}
		
		
	}

}
