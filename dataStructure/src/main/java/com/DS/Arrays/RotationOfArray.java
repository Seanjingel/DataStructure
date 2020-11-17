package com.DS.Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author URM9KOR
 * @implNote Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.
 *
 */
public class RotationOfArray implements ArrayService{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter size of An array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		RotationOfArray ra = new RotationOfArray();
		ra.insertElement(arr,n);
		System.out.println("Complete data list: "+Arrays.toString(arr));
		rotateInreversDirection(arr);
		
		
	}

	@Override
	public void insertElement(int[] arr, int length) {
		for(int i = 0;i<length;i++) {
			System.out.println("Insert Element:");
			int in = sc.nextInt();
			arr[i] = in;
		}
		
	}

	@Override
	public void displayElement(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}
	
	public static void rotateInreversDirection(int[] arr) {
		int count=0;
		int temp ;
		for(int i=arr.length-1;i>count;i--) {
			temp = arr[i];
			arr[i] = arr[count];
			arr[count] = temp;
			count++;
		}
		System.out.println("After rotation: "+Arrays.toString(arr));
	}
	
	public static void rotateArrayByGivenPosition(int[] arr, int p) {
		
	}
}
