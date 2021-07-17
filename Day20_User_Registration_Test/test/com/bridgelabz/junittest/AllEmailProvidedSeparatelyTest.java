package com.bridgelabz.junittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.program.AllEmailProvidedSeparatelyUC9;

class AllEmailProvidedSeparatelyTest {

	@Test
	void test() {
		assertEquals(true, AllEmailProvidedSeparatelyUC9.AllEmailProvided("Kumar"));
	}

}
