package com.bridgelabz.junittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.program.EmailValidationUC3;

class EmailValidationTest {

	@Test
	void test() {
		assertEquals(true, EmailValidationUC3.EmailValidation("Email"));
	}

}
