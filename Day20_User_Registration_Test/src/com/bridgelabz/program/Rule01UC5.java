package com.bridgelabz.program;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Rule01UC5 {

	public static boolean PasswordValidator(String password) {
		Scanner sc = new Scanner(System.in);						
		return(Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])"
				+ "(?=.*[@#$%^&+=])"
				+ "(?=\\S+$).{8,20}$", password));
	}
}
