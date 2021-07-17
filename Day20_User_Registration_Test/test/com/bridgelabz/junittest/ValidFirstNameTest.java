package com.bridgelabz.junittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.program.ValidFirstNameUC1;

class ValidFirstNameTest {

	@Test
	void test() {
		assertEquals(true, ValidFirstNameUC1.FirstNameValidator("Deepak"));
	}
}


