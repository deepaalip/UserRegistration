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
	
	
	
	
}
