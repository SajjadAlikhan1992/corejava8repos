package com.example.javapredicates;

import java.util.function.BiPredicate;

import org.junit.Test;

import junit.framework.Assert;

public class BiPredicateMethods {

	@Test
	public void andMethodTesting() {

		BiPredicate<Integer, Integer> bp1 = (value1, value2) -> (value1 + value2) > 10;
		BiPredicate<Integer, Integer> bp2 = (number1, number2) -> (number1 * number2) % 2 == 0;
		BiPredicate<Integer, Integer> bp3 = bp1.and(bp2);
		Assert.assertEquals(true, bp3.test(8, 3));

	}

	@Test
	public void testMethodTestingWithObject() {

		BiPredicate<Person, Integer> bp1 = (person, age) -> person.getAge() >= age;

		Assert.assertEquals(true,
				bp1.test(new Person(1, "Sajjad Alikhan Navab", 32, "Main Bazar Talupula", "Anantapur", 515581), 19));

	}

}
