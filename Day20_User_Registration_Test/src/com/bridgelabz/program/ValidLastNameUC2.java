package com.bridgelabz.program;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidLastNameUC2 {
	public static boolean LastNameValidator(String lastName) {
		Scanner sc = new Scanner(System.in);		
		return(Pattern.matches("^[A-Z]{1}[a-z]{2,}$", lastName));							
	}
}
