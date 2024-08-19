package com.example.javapredicates;

import java.util.function.Predicate;

import org.junit.Test;

import junit.framework.Assert;

public class ValidatingGivenString {

	@Test
	public void test1() {

		Predicate<String> p = str -> str.matches("[a-zA-Z]+");
		Assert.assertEquals(true, p.test("Sajjad"));
		Assert.assertEquals(true, p.test("Sajjad"));
	}

	@Test
	public void testAStringEmpty() {
		Predicate<String> p2 = str -> str.matches("");
		Assert.assertEquals(true, p2.test(""));
	}

	@Test
	public void checkAStringIsNumeric() {
		Predicate<String> p3 = str -> str.matches("\\d+");
		Assert.assertEquals(true, p3.test("123"));
	}

	@Test
	public void validateEmailAddress() {
		// "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$"
		Predicate<String> p4 = str -> str.matches("^[a-zA-z0-9+_.-]+@[a-zA-z0-9.-]+$");
		Assert.assertEquals(true, p4.test("sajjadkhannavab@gmail.com"));
		Assert.assertEquals(true, p4.test("sajjadkhannavab535537@gmail.com"));
		Assert.assertEquals(false, false);
		

	}

}
