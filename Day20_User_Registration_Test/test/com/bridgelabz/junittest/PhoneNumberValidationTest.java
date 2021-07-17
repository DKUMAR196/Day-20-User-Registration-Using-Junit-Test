package com.bridgelabz.junittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.program.PhoneNumberValidationUC4;

class PhoneNumberValidationTest {

	@Test
	void test() {
		assertEquals(true, PhoneNumberValidationUC4.PhoneNumberValidation("PhoneNumber"));
	}

}
