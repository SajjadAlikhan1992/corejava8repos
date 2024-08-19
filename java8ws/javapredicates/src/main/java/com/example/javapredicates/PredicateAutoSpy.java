package com.example.javapredicates;

import java.util.LinkedList;
import java.util.List;

public class PredicateAutoSpy {

	public static void main(String[] args) {

		List<String> names = new LinkedList();
		names.add("Sajjad");
		names.add("Sadakhat");
		names.add("Sufiyan");
		names.add("Hayatulla");
		names.add("Akif");
		names.add("Ayan");

		names.stream().filter(name -> name.startsWith("S")).forEach(System.out::println);
		names.stream().map(name -> name.toUpperCase()).forEach(System.out::println);
	}

}
