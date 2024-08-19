package com.example.javapredicates;

public class Product {

	private int pId;
	private double rate;

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public Product() {
		System.out.println("Product Object created ");
	}

	public Product(int pId, double rate) {
		super();
		this.pId = pId;
		this.rate = rate;
	}

}
