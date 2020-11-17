package com.DS.recursion;

public class RecursionDemo1 {
	public static void main(String[] args) {
		recursionDem(5);
	}
	public static void recursionDem(int n) {
		if(n == 0) {
			return;
		}
		System.out.println("Hello Rakesh");
		recursionDem(n-1);
	}

}
