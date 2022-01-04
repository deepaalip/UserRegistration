package com.bridgelabz.regex;

import java.util.Scanner;

public class RegexMain {
	public static void main(String[] args) {
	  Scanner scanner  = new Scanner(System.in);
      RegexRegistration regex = new RegexRegistration();
   
 
	  System.out.println("Enter your FirstName:");
	 
	  String firstName = scanner.next(); 
	  regex.userFirstName(firstName);
	  
	  System.out.println("Enter your LastName:");

	  String lastName = scanner.next(); 
	  regex.userLastName(lastName);

      System.out.println("Enter your email id:");
      
      String email = scanner.next();
      regex.userEmail(email);
	  
	}
	
}
