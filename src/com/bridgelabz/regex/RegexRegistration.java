package com.bridgelabz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexRegistration {
	
	private static final String FirstNameRegex= "^[A-Z][a-z]{2,}";
	
	public  boolean userFirstName(String firstName) {

		return Pattern.matches(FirstNameRegex, firstName);	
    
   }
	
	
	
	
	
	
}
