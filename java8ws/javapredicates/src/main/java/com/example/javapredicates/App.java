package com.example.javapredicates;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		List ll = new LinkedList();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(-1);
		ll.add(-2);
		ll.add(5);

		Predicate<Integer> p1 = number -> number > 0;
		Predicate<Integer> p2 = number -> number % 2 == 0;

		Predicate<Integer> p3 = p1.and(p2);

		ll.stream().filter(p3).forEach(System.out::println);

		Predicate p4 = p1.negate();

		//ll.stream().filter(p4).forEach(System.out::println);
		
		//ll.stream().filter(p2.negate()).forEach(System.out::println);
		
		//ll.stream().filter(p2.or(p1)).forEach(System.out::println);
		
	}
}
