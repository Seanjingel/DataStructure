package com.DS.Arrays.sampleLabTest;

import java.util.Arrays;
import java.util.Scanner;

public class CheckOddEvenArray {
	public static void main(String[] args) {
		CheckOddEvenArray coea = new CheckOddEvenArray();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		coea.displayOddEvenArray(arr);
		sc.close();
		
	}
	public void displayOddEvenArray(int[]  arr) {
		int[] odd = new int[arr.length];
		int[] even = new int[arr.length];
		int m = 0; 
		int n = 0;
		for(int i = 0 ; i < arr.length;i++) {
			if(arr[i]%2 != 0) {
				odd[m] = arr[i];
				m++;
			}else {
				even[n] = arr[i];
				n++;
			}
		}
		System.out.println("ODD Elements: "+Arrays.toString(odd));
		System.out.println("EVEN Elements"+Arrays.toString(even));
		
	}

}
