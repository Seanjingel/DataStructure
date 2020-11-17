package com.DS.Arrays.sampleLabTest;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String Value: ");
		String s = sc.nextLine();
		
		boolean isPalindrome = getPalindrome(s);
		if(isPalindrome) {
			System.out.println("Given string is palindrome");
		}else {
			System.out.println("Given string is not palindrome");
		}
	}

	private static boolean getPalindrome(String s) {
		for(int i=0, j = s.length()-1; i < s.length()/2;i++,j--) {
			if(s.charAt(i) != s.charAt(j)) {
				return false;
			}
		}
		return true;
	}

}
