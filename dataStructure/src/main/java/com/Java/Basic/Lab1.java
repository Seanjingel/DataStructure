package com.Java.Basic;

import java.util.Scanner;

public class Lab1 {
	static boolean isRunning;

	public static void main(String[] args) {
		isRunning = true;
		while(isRunning) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your choice");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("1");
				
				break;
			case 99:
				isRunning = false;
				System.out.println("Exit application");
				break;

			default:
				System.out.println("Invalid input");
				break;
			}
			
		}
	
	}
}
