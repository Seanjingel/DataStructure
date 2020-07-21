package com.DS.Arrays.sampleLabTest;

public class ShallowCopyDemo {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5,6};
		int[] arr2 = arr1;
		arr1[0] = -1;
		for(int i : arr2) {
			System.out.println("Number: "+i);
		}
	}

}
