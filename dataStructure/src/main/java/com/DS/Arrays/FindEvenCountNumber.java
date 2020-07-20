package com.DS.Arrays;



/**
 * @author URM9KOR
 * 
 * Given an array nums of integers, return how many of them contain an even number of digits.
 *
 */
public class FindEvenCountNumber {
	
	public static void main(String[] args) {
		int[] nums = {12,6,234,1232};
		FindEvenCountNumber f = new FindEvenCountNumber();
		System.out.println(f.findNumbers(nums));
		
	}
	
	 public int findNumbers(int[] nums) {
	        int evenNumber = 0;
	        for(int i = 0;i<nums.length;i++){
	            int num = nums[i];
	            int count = 0 ;
	           while(num > 0){
	               int res = num % 10;
	               count++;
	               num = num/10;
	           }
	            if(count %2 == 0){
	                evenNumber++;
	            }
	        }
	        return evenNumber;
	        
	    }

}
