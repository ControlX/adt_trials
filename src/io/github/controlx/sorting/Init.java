package io.github.controlx.sorting;

import java.util.Arrays;

public class Init {

	public static void main(String[] args) {
		
		int[] unsortedArray = {6,1,3,8,6,0,9,7,5,2};
		
		/*
		 Selection Sort
			1. Comparison Based Algo
			2. In Place ,so Space Complexity= O(1)
			3. Time complexity (n^2)
			4. Offline Algo
			5. Unstable Algo
			6. Non-Recursive
		 */
		System.out.println(Arrays.toString(SelectionSort.sort(unsortedArray)) + " <---Selection Sort");
		
		/**
		 * Bubble Sort
		 * 
		 * Check for the double loop used at:
		 * https://www.youtube.com/watch?v=Jdtq5uKz-w4&list=PL2_aWCzGMAwKedT2KfDMB9YA5DgASZb3U&index=3
		 * 
		 * Best case: O(n)
		 * Average/worst case: O(n^2)
		 * Inplace and stable sorting algorithm
		 * 
		 */
		System.out.println(Arrays.toString(BubbleSort.sort(unsortedArray)) + " <---Bubble Sort");
	}
}
