package com.example.javapredicates;

import java.util.LinkedList;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

import org.junit.Assert;
import org.junit.Test;

public class LoggerUtilTest {

	@Test
	public void test() {
		LoggerUtil loggerUtil1 = LoggerUtil.getInstance();
		LoggerUtil loggerUtil2 = LoggerUtil.getInstance();

		if (loggerUtil1 == loggerUtil2) {
			System.out.println("Objects are equal");
		} else {
			System.out.println("Not Equal");
		}

		loggerUtil1.printLogMessage("Hello Sajjad, Welcome to Design Patterns");
	}

	@Test
	public void evenCheck() {

		IntPredicate intPredicate = (age) -> age > 19;
		Assert.assertEquals(true, intPredicate.test(21));
		// Assert.assertEquals(false, intPredicate.test(25));
	}

	@Test
	public void checkEquality() {
		Predicate<String> predicate = (str) -> str.contentEquals("java");
		Assert.assertEquals(true, predicate.test("Java"));
	}

	@Test
	public void equalsIgnoreCase() {
		Predicate<String> preString = (str) -> str.equals("JAVA");
		Assert.assertEquals(true, preString.test("Java"));
	}

	@Test
	public void checkANamesStartWithA() {
		List<String> names = new LinkedList();
		names.add("Sajjad");
		names.add("Sadakhat");
		names.add("Sufiyan");
		names.add("Hayatulla");
		names.add("Akif");
		names.add("Ayan");

		names.stream().filter(name -> name.startsWith("S")).forEach(System.out::println);
	}
	
	

}
