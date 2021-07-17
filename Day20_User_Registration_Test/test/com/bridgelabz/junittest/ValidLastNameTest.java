package com.bridgelabz.junittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.program.ValidLastNameUC2;

class ValidLastNameTest {

	@Test
	void test() {
		assertEquals(true, ValidLastNameUC2.LastNameValidator("Kumar"));
	}

}
