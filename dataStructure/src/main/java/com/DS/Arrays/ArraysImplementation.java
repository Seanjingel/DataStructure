package com.DS.Arrays;

public class ArraysImplementation {
	public static int[] arr = new int[10];
	
	public static void insert(int index, int data) {
		if(index > arr.length) {
			System.out.println("Array index out of bound.");
			return;
		}
		for(int i = 0;i<arr.length;i++) {
			if(i == index) {
				arr[i] = data;
			}
		}
		
	}
	public static void display() {
		System.out.println(arr[3]);
	}

}
