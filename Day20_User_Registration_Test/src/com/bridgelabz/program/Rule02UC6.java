package com.bridgelabz.program;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Rule02UC6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);				
		System.out.println("Enter Your Password At Least One Uper Case");
		String password = sc.next();
		System.out.println(Pattern.matches("^[a-z][A-Z]{1}[0-9][$&+,:;=?@#|'<>.-^*()%!]$", password));
	}
}