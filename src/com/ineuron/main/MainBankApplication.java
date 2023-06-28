package com.ineuron.main;


public class MainBankApplication 
{
	public static void main(String[] agrs)
	{
		  System.out.print("How many number of customers do you want to input? "); 
		  int n = sc.nextInt();  
	        BankDetails C[] = new BankDetails[n];
	        
	        for(;;)
	        {
	        	System.out.println("this is for no of accounts");
	        }
	        int ch;
	        do {  
	            System.out.println("\n ***Banking System Application***");  
	            System.out.println("1. Display all account details"
	            		+ " \n 2. Search by Account number\n "
	            		+ "3. Deposit the amount \n"
	            		+ " 4. Withdraw the amount \n"
	            		+ " 5.Exit ");  
	            System.out.println("Enter your choice: ");  
	             ch = sc.nextInt();  
	                switch (ch) {  
	                    case 1:  
	                    	System.out.println("Display all account details");
	                        break;  
	                    case 2:  
	                    	System.out.println("Search by Account number"); 
	                        break;  
	                    case 3:  
	                    	System.out.println("Deposit the amount"); 
	                        break;  
	                    case 4:  
	                    	System.out.println("");
	                        break;  
	                    case 5:  
	                        System.out.println("Exit...");  
	                        break;  
	                }  
	            }  
	            while (ch != 5);  

	        
	}
	
}
