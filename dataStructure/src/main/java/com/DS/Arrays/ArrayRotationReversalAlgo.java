package com.DS.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotationReversalAlgo {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayRotationReversalAlgo reversalAlgo = new ArrayRotationReversalAlgo();
		System.out.println("Enter Size of array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		reversalAlgo.insertElement(arr, n);
		int pos = sc.nextInt();
		reversalAlgo.rotateArrayReverseAlgo(arr, pos);
		
		
	}
	public void insertElement(int[] arr, int size) {
		System.out.println("Insert Element: ");
		for(int i = 0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Element are: "+Arrays.toString(arr));
		
	}
	public void reverseArray(int[] arr, int start, int end) {
		int temp; 
        while (start < end) { 
            temp = arr[start]; 
            arr[start] = arr[end]; 
            arr[end] = temp; 
            start++; 
            end--; 
        }
		
	}
	public void rotateArrayReverseAlgo(int[] arr, int position) {
		int size = arr.length;
		reverseArray(arr, 0, position-1);
		reverseArray(arr, position, size-1);
		reverseArray(arr, 0, size-1);
		System.out.println("Array Elements: "+Arrays.toString(arr));
	}
	

}
