package com.sortings;

public class InsertionSort {

	public static void sortElements(int[] arr) {
		int n = arr.length;
		for(int i = 0; i<n;i++) {
			int k = arr[i];
			int j = i-1;
			
			while(j>=0 && arr[j] > k) {
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1]=k;
		}
	}
	
	public static void displayData(int[]arr) {
		for(int dt : arr) {
			System.out.print(dt+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int [] arr = {5,1,12,-5,16,2,14};
		
		// before sorting
		displayData(arr);
		System.out.println("--------------------------------");
		sortElements(arr);
		
		// after sorting
		displayData(arr);

	}

}
