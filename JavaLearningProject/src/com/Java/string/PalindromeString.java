package com.Java.string;

import java.util.Scanner;

public class PalindromeString {
	private static PalindromeString instance;
	static Scanner sc = new Scanner(System.in);

	public static PalindromeString getInstance() {
		if (instance == null) {
			instance = new PalindromeString();
		}
		return instance;
	}

	public static void main(String[] args) {
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		boolean isPalindrome = getInstance().isPalindrom(s);
		if(isPalindrome) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
		boolean isPali = getInstance().isPalindromeString(s);
		if(isPali) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}

	//Using StringBuilder class
	public boolean isPalindrom(String s) {
		StringBuilder s2 = new StringBuilder(s);
		s2.reverse();
		if (s.equals(s2.toString())) {
			return true;

		} else {
			return false;
		}
	}
	
	//without using StringBuilder Class
	public boolean isPalindromeString(String s) {
		int length = s.length();
		System.out.println(length);
		for(int i = 0;i<=length/2;i++) {
			if(s.charAt(i) != s.charAt(length-i-1)) {
				return false;
			}
		}
		return true;
	}

}
