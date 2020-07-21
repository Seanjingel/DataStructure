package com.DS.Arrays.sampleLabTest;
import java.util.Scanner;
public class Lab1 {
	public int[] arr;
	static Scanner sc = new Scanner(System.in);
	public Lab1(int n) {
		arr = new int[n];
	}
	public static void main(String[] args) {
		System.out.println("Enter Array Size: ");
		int n =  sc.nextInt();
		Lab1 l1 = new Lab1(n);
		l1.add(0, 10);
		l1.add(1, 20);
		l1.add(2, 30);
		l1.add(3, 40);
		l1.add(4, 50);
		l1.printArrayElement();
		
	}
	
	public void add(int index, int data) {
		for(int i = 0 ; i < arr.length;i++) {
			if(i == index) {
				arr[i] = data;
			}
		}
	}
	public void addAfterGivenData(int data, int newData) {
		for(int i = 0 ; i<arr.length;i++) {
			if(arr[i] == data) {
				arr[i+1] = newData;
				
			}
		}
	}
	public void printArrayElement() {
		for(int i:arr) {
			System.out.println(i+" ");
		}
	}

}
