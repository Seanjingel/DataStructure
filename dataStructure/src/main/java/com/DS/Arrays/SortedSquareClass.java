package com.DS.Arrays;

import java.util.Arrays;

/**
 * @author URM9KOR
 * Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number,
 * also in sorted non-decreasing order.
 *
 */
public class SortedSquareClass {
	
	 public int[] sortedSquares(int[] A) {
	        int[] B = new int[A.length];
	        for(int i = 0 ;i<A.length;i++){
	            int square = A[i]*A[i];
	            B[i] = square;
	        }
	        
	        Arrays.sort(B);
	        return B;
	        
	    }
	 
	 public int[] sortedSquares(int[] A, String S) {
	        int[] B = new int[A.length];
	        for(int i = 0 ;i<A.length;i++){
	            int square = A[i]*A[i];
	            B[i] = square;
	        }
	        
	        for(int i = 0;i<B.length;i++){
	            for(int j = i+1;j<B.length;j++){
	                if(B[i] > B[j]){
	                    int temp = B[i];
	                    B[i] = B[j];
	                    B[j] = temp;
	                }
	            }
	        }
	        return B;
	        
	    }
	

}
