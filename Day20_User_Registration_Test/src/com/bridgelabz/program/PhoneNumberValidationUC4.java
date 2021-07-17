package com.bridgelabz.program;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PhoneNumberValidationUC4 {
	public static boolean PhoneNumberValidation(String phoneNumber) {
		Scanner sc = new Scanner(System.in);
		return(Pattern.matches("^91\\s[0-9]{10}$", phoneNumber));
	}
}