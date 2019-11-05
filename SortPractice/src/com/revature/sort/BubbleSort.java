package com.revature.sort;

public class BubbleSort {
	
	public static void sort(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			int tempStart = arr[i];
			int n = (arr.length - 1) - i;
			int tempEnd = arr[n];
			if (tempEnd < tempStart) {
				tempEnd = tempStart;
			}
		}
	}
}
