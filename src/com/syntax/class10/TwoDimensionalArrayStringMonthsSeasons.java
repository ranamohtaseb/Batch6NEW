package com.syntax.class10;

public class TwoDimensionalArrayStringMonthsSeasons {

	public static void main(String[] args) {
		// Store the months for each season is an array
		// season is rows and months are the columns

		String[][] season= { 
			{"January","February","December"},
			{"March","April","May"},
			{"June","July","August"},
			{"September","October","November"}
		};
			
		System.out.println(season[0][2]);
		System.out.println(season[3][1]);
		System.out.println("______________");
		System.out.println(season.length); // it will print the number of rows =4
		
		int rows=season.length;
		int firstArray=season[0].length;//3
		System.out.println(firstArray);
		System.out.println("______________");
		for (int i=0; i<season.length;i++) {
			for (int j=0; j<season[i].length;j++) {
				System.out.println(season[i][j]);
		}
	}

}}

