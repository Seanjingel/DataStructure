package com.DS.Arrays.sampleLabTest;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElementAtGivenPosition {
	public static void main(String[] args) {
		InsertElementAtGivenPosition atGivenPosition = new InsertElementAtGivenPosition();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter POsition");
		int position = sc.nextInt();
		System.out.println("Enter data want to insert: ");
		int element = sc.nextInt();
		arr = atGivenPosition.insertElementAtGivenPosition(arr,position, element);
		System.out.println(Arrays.toString(arr));
		sc.close();
		
	}
	public int[] insertElementAtGivenPosition(int[] arr, int position, int element) {
		for(int i = arr.length-1;i>position;i--) {
			arr[i] = arr[i-1];
		}
		arr[position] = element;
		
		return arr;
	}

}
