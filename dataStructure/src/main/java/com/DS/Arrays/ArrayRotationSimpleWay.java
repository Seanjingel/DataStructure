package com.DS.Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * {@docRoot}s: Program to Reverse Array from given index.
 * 			@see Program also include to reverse complete Array.
 * {@link: <h1>Reverse Program}
 * 
 *
 */
public class ArrayRotationSimpleWay {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayRotationSimpleWay arrayRotationSimpleWay = new ArrayRotationSimpleWay();
		System.out.println("Enter Size of array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		arrayRotationSimpleWay.insertElement(arr, n);
		
		arrayRotationSimpleWay.rotateArrayInReverse(arr);
		
//		System.out.println("Enter Position:");
//		int position = sc.nextInt();
////		arrayRotationSimpleWay.rotateByGivenData(arr,position);
//		arrayRotationSimpleWay.rotateArray(arr, position);
		
	}
	/*
	 * Rotate array by given position.
	 */
	@SuppressWarnings("unused")
	private void rotateByGivenData(int[] arr,int position) {
		System.out.println("Array length: "+arr.length);
		int[] newArr = new int[position];
		int count = newArr.length-1;
		System.out.println("Count Val: "+count);
		for(int i = 0;i<position;i++) {
			newArr[i] = arr[i];
		}
		for(int i = 0;i<arr.length-2;i++) {
			arr[i] = arr[i+2];
		}
		for(int i = arr.length-1;i>=arr.length-position;i--) {
			arr[i] = newArr[count];
			count--;
		}
		System.out.println("Old Array Element: "+Arrays.toString(arr));
		System.out.println("Array Element: "+Arrays.toString(newArr));
		
	}
	
	// Rotate Complete Array.
	@SuppressWarnings("unused")
	private void rotateArrayInReverse(int[] arr) {
		if(arr.length == 1) {
			System.out.println("Only single element available in array: ");
			return;
		}
		int count = 0;
		int temp ;
		for(int i = arr.length-1; i >count;i--) {
			temp = arr[i];
			arr[i] = arr[count];
			arr[count] = temp;
			count++;
		}
		System.out.println("After rotation: "+Arrays.toString(arr));
		
	}
	public void rotateArray(int[] arr,int index) {
		for(int i = 0;i<index;i++) {
			rotateByOne(arr);
		}
		System.out.println("Old Array Element: "+Arrays.toString(arr));
		
	}
	public void rotateByOne(int[] arr) {
		int temp = arr[0];
		int i ;
		for(i = 0;i<arr.length-1;i++) {
			arr[i] = arr[i+1];
		}
		arr[i] = temp;
	}
	
	public void insertElement(int[] arr, int size) {
		System.out.println("Insert Element: ");
		for(int i = 0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Element are: "+Arrays.toString(arr));
		
	}
	
	
	

}
