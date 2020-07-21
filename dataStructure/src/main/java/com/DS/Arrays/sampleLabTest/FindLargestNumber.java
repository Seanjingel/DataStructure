package com.DS.Arrays.sampleLabTest;

import java.util.Arrays;

public class FindLargestNumber {
	static public int[] arr = {2,10,4,21,19,30};;
	private int max = 0;
	private int secondLargest = 0;

//	public FindLargestNumber(int n) {
//		arr = new int[n];
////		for (int i = 0; i < arr.length; i++) {
////			arr[i] = i + 2;
////		}
//	}

	public static void main(String[] args) {
		FindLargestNumber fln = new FindLargestNumber();
		System.out.println(Arrays.toString(arr));
		int largestNumber = fln.findLargestNumber();
		System.out.println("Largest Number from Array is: "+largestNumber);
	}

	public int findLargestNumber() {
		for (int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				secondLargest = max;
				max = arr[i];
			}
			

		}
		System.out.println("Second Largest Number: "+secondLargest);
		return max;
	}

}
