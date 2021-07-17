package com.bridgelabz.junittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.program.Rule01UC5;

class PasswordValidatorTest {

	@Test
	void test() {
		assertEquals(true, Rule01UC5.PasswordValidator("PassWord"));
	}

}
