package com.example.collectorsoperations;

import com.example.entites.Product;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class SummingIntClientApplication {
    public static void main(String[] args) {

        List<Product> products = new LinkedList<>();
        products.add(new Product("Vega Helmet", 1000.00));
        products.add(new Product("Dairy Milk Bubbles", 299.00));
        products.add(new Product("Dairy Milk Fruit and nuts", 325.00));
        products.add(new Product("Smart Watch", 2000.00));

        Double totalBill = products.stream().collect(Collectors.summingDouble(product -> product.getPrice()));
        System.out.println("Total Bill is --> " + totalBill);

    }

}
