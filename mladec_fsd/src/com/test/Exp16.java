package com.test;

public class Exp16 {

	public static void main(String[] args) {
		
		int [] [] arr = new int[3][3];
		arr[0][0] = 101;
		
		int [][] arr1 = {{101,102,103},{104,105,106},{107,108,109}};

		for(int i = 0 ; i<arr1.length; i++)
		{
			for(int j = 0 ; j<arr1.length; j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
	}

}
