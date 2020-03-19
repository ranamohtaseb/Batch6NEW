package com.syntax.calss04;

public class NestedIfContinues {

	public static void main(String[] args) {
		// Check if patient has any allergies
		//if no allergies --> you are healthy
		//otherwise check if patient has:
			//orange allergy --> do not eat oranges
			//apple allergy --> do not eat apples
			//kiwi allergy --) do not eat kiwi
		
		boolean allergy=true;
		boolean appleAllergy=true;
		boolean orangeAllergy=true;
		boolean kiwiAllergy=true;
		
		if(allergy) {
			System.out.println("Please answer below");
			
			    if (orangeAllergy) {
				System.out.println("do not eat oranges");	
			     }
			    if (appleAllergy) {
				System.out.println("do not eat apples ");
			    }
			    if (kiwiAllergy) {
			    System.out.println("do not eat kiwi");
		        }
		}else {
			System.out.println("you are healthy");
		}

		System.out.println("___________________________");
		
		boolean allergy1=true;
		boolean appleAllergy1=true;
		boolean orangeAllergy1=true;
		boolean kiwiAllergy1=true;
		
		if(allergy1) {
			System.out.println("Please answer below");
			
			    if (orangeAllergy1) {
				System.out.println("do not eat oranges");	
			     }
			    else if (appleAllergy1) {
				System.out.println("do not eat apples ");
			    }
			    else if (kiwiAllergy1) {
			    System.out.println("do not eat kiwi");
		        }
		}else {
			System.out.println("you are healthy");
		}

	}

}
