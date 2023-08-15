package com.ineuron.main;

import java.util.Scanner;

public class MenuForBA 
{
	Scanner sc1 = new Scanner(System.in);
	int ch;
	public void menu()
	{
		
	    System.out.println("\n ********Banking Application*******");  
        System.out.println(" 1. Display all account details \n 2. Search by Account number\n 3. Deposit the amount \n 4. Withdraw the amount \n 5.Exit ");  
        System.out.println("Enter your choice: ");
	    ch = sc1.nextInt();
	}
}
