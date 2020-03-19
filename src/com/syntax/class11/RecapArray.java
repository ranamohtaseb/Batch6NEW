package com.syntax.class11;

public class RecapArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] grocerries = { { "cucumbers", "potato", "carrot" }, { "mango", "apple", "banana", "kiwi" },
				{ "milk", "cheese", "yogurt" } };
		System.out.println(grocerries[1][2]);
		System.out.println("_____________");
//get all values from 2D array
		for (int r = 0; r < grocerries.length; r++) {
			for (int c = 0; c < grocerries[r].length; c++) {
				System.out.print(grocerries[r][c]+" ");
			}
			System.out.println();
		}
			System.out.println("_____Getting elemnets using advanced for loop__________");
		//outloop loops through all arrays	
	for (String [] array:grocerries) {
		//iner loop loops through each single array
		for (String items:array) {
			System.out.print(items+" ");
		}
		System.out.println();
		}
	}
	}
// Asel program below
//String[][] groceries={
//        {"cucumber","potato", "carrot"},
//        {"mango", "apple", "banana", "kiwi"},
//        {"milk", "cheese", "yogurt"}
//        };
//
//System.out.println(groceries[1][2]);
//
////get all values from 2D array
////loop through rows
//for(int r=0; r<groceries.length; r++) {
//    //loop through columns
//    for(int c=0; c<groceries[r].length; c++) {
//        System.out.print(groceries[r][c]+" ");
//    }
//    System.out.println();
//}
//
//System.out.println("-- GETTING ELEMENTS USING ADVANCED FOR LOOP --");
////loops through all arrays
//for(String[] array:groceries) {
//    //loop through each single array
//    for(String items:array) {
//        System.out.print(items+" ");
//    }
//    System.out.println();
//}
//}
//}
//String[][] groceries={
//{"cucumber","potato", "carrot"},
//{"mango", "apple", "banana", "kiwi"},
//{"milk", "cheese", "yogurt"}};
//System.out.println(groceries[1][2]);
//get all values from 2D array//loop through rowsfor(int r=0; r<groceries.length; r++) {//loop through columnsfor(int c=0; c<groceries[r].length; c++) {System.out.print(groceries[r][c]+" ");}System.out.println();}System.out.println("-- GETTING ELEMENTS USING ADVANCED FOR LOOP --");//loops through all arraysfor(String[] array:groceries) {//loop through each single arrayfor(String items:array) {System.out.print(items+" ");}System.out.println();}
