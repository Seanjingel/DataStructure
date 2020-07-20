package com.DS.Arrays;

public class InsertElementAtBegining {
	public static void main(String[] args) {
		int[] arr = new int[4];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		
		for(int i = arr.length-1;i>0;i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = 5;
		
		for(int i : arr) {
			System.out.println(i);
		}
	}

}
