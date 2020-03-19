package com.syntax.class10;

public class ArrayLargest {

	public static void main(String[] args) {
		// ind largest element from an array

		int[] nums = { 200, 30, -1, 900, 56, 787, 1000 };
		int i;

		// Initialize maximum element
		int largest = nums[0]; // assuming the first elemnt is the largest

		// Traverse array elements from second and
		// compare every element with current max
		for (i = 1; i < nums.length; i++) {// since we set nums[0] is the largest,we starti=1
			if (nums[i] > largest) {
				largest = nums[i];
			}
		}

		System.out.println("The largest number is " + largest);
	}
}
