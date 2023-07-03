package com.ineuron.main;

import java.util.Scanner;

public class MainBankApplication 
{

	
	public static void main(String[] agrs)
	{
        Scanner sc = new Scanner(System.in);  
        //create initial accounts  
        System.out.print("How many number of accounts do you want to Open? ");  
        int n = sc.nextInt();  
        BankDetails C[] = new BankDetails[n];  
        for (int i = 0; i < C.length; i++) 
        {  
            C[i] = new BankDetails();  
            C[i].openAccount();  
        }  
       
        MenuForBA m = new MenuForBA();
        m.menu();
      
      while(true)
        {
	    if( m.ch == 1)
	    {
	    	for (int i = 0; i < C.length; i++) 
            {  
                C[i].showAccount();  
            } 
	    	m.menu();
	    	
	    }
	    else if (m.ch == 2)
	    {
	    	System.out.print("Enter account Number,which you want to search: ");  
            String ac_no = sc.next();  
            boolean found = false;  
            for (int i = 0; i < C.length; i++) 
            {  
                found = C[i].search(ac_no);  
                if (found) {  
                    break ;
                }  
            }  
            if (!found) 
            {  
                System.out.println("Search failed! Account doesn't exist..!!");  
            }
            
            m.menu();
            
	    }
	    else if (m.ch == 3)
	    {
	    	 System.out.print("Enter Account no. : ");  
             String ac_no = sc.next();  
             boolean found = false;  
             for (int i = 0; i < C.length; i++) {  
                 found = C[i].search(ac_no);  
                 if (found) {  
                     C[i].deposit();  
                     break ;  
                 }  
             }  
             if (!found) {  
                 System.out.println("Search failed! Account doesn't exist..!!");  
             }  
             
             m.menu();
	    }
	    else if (m.ch == 4)
	    {
	    	System.out.print("Enter Account No : ");  
           String ac_no = sc.next();  
           boolean found = false;  
            for (int i = 0; i < C.length; i++) {  
                found = C[i].search(ac_no);  
                if (found) {  
                    C[i].withdrawal();  
                    break ;  
                }  
            }  
            if (!found) {  
                System.out.println("Search failed! Account doesn't exist..!!");  
            } 
            
            m.menu();	
            
	    }
	    else if (m.ch == 5)
	    {
	    	  System.out.println("See you soon..."); 
	    	  break;
	    	
	    }
	    else
	    {
	    	System.out.println(" Enter a valid number between range 1 to 5 !! ");
	    	m.menu();
	    }
       }
	}
	
}
