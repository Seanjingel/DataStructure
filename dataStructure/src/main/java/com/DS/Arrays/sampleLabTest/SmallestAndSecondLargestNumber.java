package com.DS.Arrays.sampleLabTest;
import java.util.*;

public class SmallestAndSecondLargestNumber {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		SmallestAndSecondLargestNumber ssl= new SmallestAndSecondLargestNumber();
		System.out.println("Enter Size of array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		ssl.findSmallAndsecondLargest(arr);
	}
	public void findSmallAndsecondLargest(int[] arr) {
		Arrays.sort(arr);
		System.out.println("Smallest Number: "+arr[0]);
		System.out.println("Second largest Number: "+arr[arr.length-2]);
		
	}

}
