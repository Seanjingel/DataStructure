package com.DS.Arrays;

import java.util.Arrays;

public class MergerSortedArray {
	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int[] nums2 = { 2, 5, 6 };

		MergerSortedArray msa = new MergerSortedArray();
		msa.mergeSortedArray(nums1, 3, nums2, 3);
		
		
		
	}

	public void mergeSortedArray(int[] nums1, int m, int[] nums2, int n) {
//		int count = 0;
		int[] nums3 = new int[n + m];
//		for (int i = 0; i < m ; i++) {
//			nums3[count] = nums1[i];
//			count++;
//		}
//		for (int j = 0; j < n ; j++) {
//			nums3[count] = nums2[j];
//			count++;
//		}
//		Arrays.sort(nums3);
//		for (int element : nums3) {
//			System.out.println(element);
//		}
		
		int i = 0, j = 0, k = 0; 
	      
        // Traverse both array 
        while (i<m && j <n) 
        { 
            // Check if current element of first 
            // array is smaller than current element 
            // of second array. If yes, store first 
            // array element and increment first array 
            // index. Otherwise do same with second array 
            if (nums1[i] < nums2[j]) 
                nums3[k++] = nums1[i++]; 
            else
                nums3[k++] = nums2[j++]; 
        } 
      
        // Store remaining elements of first array 
        while (i < m) 
            nums3[k++] = nums1[i++]; 
      
        // Store remaining elements of second array 
        while (j < n) 
            nums3[k++] = nums2[j++];
        
        System.out.println("After Merge : ");
        for(int element: nums3) {
        	System.out.println(element);
        }
	}

}
