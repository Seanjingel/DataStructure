package com.Java.string;

public class Lab1 {
	public static void main(String[] args) {
		String str = new String("abc");
		str.intern();
		String str1 = "abc";
		System.out.println(str == str1);
		System.out.println(str1.hashCode());
	}

}
