package com.revature.sort;

public class BubbleSort {
	
	public static void sort(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length-1;i++) {
			for(int j=arr.length-1;j>i;j--) {
				
				if(arr[i]>arr[j]) {
					int temp;
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					}
				
			}
			
		}
	}
}
