package com.syntax.class11;

public class ArrayExamplesProffesions {

	public static void main(String[] args) {
		// let's create 2D array in which we store proffesios
		
		String[][] professions= {
				{"QA Testers", "Development", "Product Owner","Scrum Master"},
				{"Math Teacher", "Science Teacher", "ESL Teacher"},
				{"Dentist", "Surgeon"}
		};
		
		//get elements using advanced for loop
		
		for (String[] occupation: professions) {
			for (String title:occupation) {
				System.out.print(title+" , ");
			}
			System.out.println();
		}
	}}
//Asel code
//public class MoreExamples2DArray {
//    public static void main(String[] args) {
//        //lets create 2D array in which we store professions
//        
//        String[][] professions= {
//                {"QA Tester", "Developers", "Product Owner", "Scrum Master"},
//                {"Math Teacher", "Science Teacher", "ESL Teacher"},
//                {"Dentist", "Surgeon"}
//        };
//        
//        //get elements using advanced for loop
//        
//        for(String[] occupation:professions) {
//            for(String title:occupation) {
//                System.out.print(title+" ");
//            }
//            System.out.println();
//        }
//        
//    }
//}
//Collapse







