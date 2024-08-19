package com.example.javapredicates;

import java.util.LinkedList;
import java.util.List;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;

import org.junit.Test;

public class ConsumerExamples {

	@Test
	public void test1() {

		List<Product> products = getProducts();
		products.forEach(product -> {
			double actualRate = product.getRate();
			double discount = product.getRate() * 0.10;
			double newRate = actualRate - discount;
			product.setRate(newRate);
		});
	}

	@Test
	public void test2() {

		// i want to print the tables from 1 to 20
		IntConsumer intConsumer = (number) -> {
			for (int i = 1; i <= number; i++) {
				for (int j = 1; j <= number; j++) {

					System.out.println(i * j);
					System.out.println("********************************");
				}
			}
		};

		IntConsumer stringConsumer = (number) -> {
			System.out.println("****************************");
		};

		IntConsumer consumer3 = intConsumer.andThen(stringConsumer);
		consumer3.accept(20);
	}

	@Test
	public void checkPensionEligibiilityProgram() {

		ObjIntConsumer<Person> objIntConsumer = (person, age) -> {
			String result = person.getAge() > age ? "Eligible for Pension Scheme" : "Not Eligible For Pension Scheme";
			System.out.println(result);
		};

		objIntConsumer.accept(new Person(1, "Sajjad Alikhan N", 32, "Main Bazar, Talupula", "Anantapur", 515581), 30);

	}

	private List<Product> getProducts() {
		List<Product> products = new LinkedList<>();

		Product product = new Product(1, 500.00);
		Product product1 = new Product(2, 1000.00);
		Product product2 = new Product(3, 1500.00);
		Product product3 = new Product(4, 2000.00);
		Product product4 = new Product(5, 2500.00);
		Product product5 = new Product(6, 3000.00);

		products.add(product1);
		products.add(product2);
		products.add(product3);
		products.add(product4);
		products.add(product5);

		return products;
	}

}
