package com.test;

import java.util.Scanner;

public class SwitchExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		boolean y = true;
		
		
		while (y) {
			System.out.println("Please select an option from bellow :");
			System.out.println("1: Create Account\n2: Login\n3: Transfer\n4: Withdraw\n5: Check Balance\n 6: Logout");
			
			System.out.print("Enter the option here : ");
			Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
			switch (x) {
				case 1 : System.out.println("Account Created Successfully!\n");break;
				case 2 : System.out.println("Login Successful!\n");break;
				case 3 : System.out.println("Transfer Successful!\n");break;
				case 4 : System.out.println("Withdraw Successful!\n");break;
				case 5 : System.out.println("Your Account balance is 0.0!\n");break;
				case 6 : System.out.println("Thank you, Logged Out Successfully! \n"); y = false; break;
				default : System.out.println("Invalid Option !!!, please enter a valid option\n");break;
			}
		}
	}

}
