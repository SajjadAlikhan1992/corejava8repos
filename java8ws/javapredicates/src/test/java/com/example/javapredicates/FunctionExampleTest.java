package com.example.javapredicates;

import java.util.function.Function;

import org.junit.Assert;
import org.junit.Test;

public class FunctionExampleTest {

	@Test
	public void test() {

		Function<String, Integer> f1 = (str) -> str.length();

		//System.out.println(f1.apply("Sajjad Alikhan"));
		int actual = f1.apply("Sajjad");
		Assert.assertEquals(6, actual);
	}

}
