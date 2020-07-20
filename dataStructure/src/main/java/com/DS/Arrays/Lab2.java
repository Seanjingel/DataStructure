package com.DS.Arrays;

public class Lab2 {
	public static void main(String[] args) {
		int count = 0;
		int[] arr = {1,0,1,1,0,1};
		int maxCount = 1;
		for(int i = 0 ;i<arr.length;i++) {
			if(arr[i] == 1) {
				count = count+1;
				if(maxCount < count) {
					maxCount = count;
				}
			}else {
				count = 0;
			}
		}
		System.out.println("Total occurence: "+maxCount);
	}
	

}
