package com.searching;

public class LinearSearch {

	public static int searchElement(int[] arr, int target) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == target) {
				return i ;
			}
			
		}
		return -1;
	}
	public static void main(String[] args) {
	
		int[]arr = {2,4,12,76,443,223};
		int target = 12;
		int index = searchElement(arr,target);
		
		if(index != -1) {
			System.out.println("The target element is : " + arr[index]);
			System.out.println("The target index is : " +index);
		}
		else
		{
			System.out.println("The target value not found in array");
		}

	}

}
