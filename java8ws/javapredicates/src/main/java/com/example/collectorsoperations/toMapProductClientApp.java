package com.example.collectorsoperations;

import com.example.entites.Product;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class toMapProductClientApp {
    public static void main(String[] args) {

        List<Product> products = new LinkedList<>();
        products.add(new Product("Vega Helmet", 1000.00));
        products.add(new Product("Dairy Milk Bubbles", 299.00));
        products.add(new Product("Dairy Milk Fruit and nuts", 325.00));
        products.add(new Product("Smart Watch", 2000.00));

        //finding the number of elements in a stream
        Long countIs
                = products.stream().collect(Collectors.counting());

        System.out.println(countIs);
        Map<String, Double> stringDoubleMap = products.stream().collect(Collectors.toMap(Product::getName, Product::getPrice));
        System.out.println(stringDoubleMap);


    }
}
