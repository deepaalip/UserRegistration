package com.bridgelabz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexRegistration {
	
	public static  boolean userFirstName(String firstName) {

		String FirstName= "^[A-Z][a-z]{3,}";
		Pattern pattern =Pattern.compile(FirstName);
		Matcher matcher = pattern.matcher(firstName);
	
	    System.out.println(matcher.matches());
		return true;		
    

	
	}

	
	public static  boolean userLastName(String lastName) {

		String LastName= "^[A-Z][a-z]{3,}";
		Pattern pattern =Pattern.compile(LastName);
		Matcher matcher = pattern.matcher(lastName);
	
	System.out.println(matcher.matches());
		return true;		

	}
	
	
	public static  boolean userEmail(String email) {
		
		 String emailreg = "^[A-Za-z0-9_-]+([.][A-Za-z0-9_-]+)@[A-Za-z]+[A-Za-z]+([.][A-Za-z]+)$";
		 Pattern pattern = Pattern.compile(emailreg);
		 Matcher matcher = pattern.matcher(email);
		 
		 System.out.println(matcher.matches());
			return true;		

	}
	
	
	
	public static  boolean userPassword(String password) {
	    String Passreg="^(?=.*[0-9])(?=.*[A-Z])([0-9A-Za-z]){8,}$"; // Rule-3 Atleast one Numeric Number in Password
	    
		Pattern pattern =Pattern.compile(Passreg);
		Matcher matcher = pattern.matcher(password);
		
	System.out.println(matcher.matches());
		return true;
    }
	
}
