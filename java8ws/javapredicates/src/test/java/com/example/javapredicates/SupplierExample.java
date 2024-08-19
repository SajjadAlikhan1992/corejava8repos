package com.example.javapredicates;

import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

import org.junit.Test;

import junit.framework.Assert;

public class SupplierExample {

	@Test
	public void testSupplier() {

		Supplier<Person> personSupplier = () -> new Person(1, "Sajjad Alikhan N", 32, "Main Bazar, Talupula",
				"Anantapur", 515581);

		/* Assert.assertEquals("Sajjad Alikhan N", personSupplier.get().getName()); */
		Assert.assertNotNull(personSupplier.get());

	}

	@Test
	public void testSupplierInt() {
		IntSupplier dSupplier = () -> (int) (Math.random() * 10000);
		System.out.println(dSupplier.getAsInt());
	}

	@Test
	public void testSupplierLong() {
		LongSupplier longsSupplier = () -> System.currentTimeMillis();
		System.out.println("Current time in Milli Seconds-->" + longsSupplier.getAsLong());
	}
	
	

}
