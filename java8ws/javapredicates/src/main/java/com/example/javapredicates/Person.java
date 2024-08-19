package com.example.javapredicates;

public class Person {

	private int pid;
	private String name;
	private int age;
	private String address;
	private String city;
	private long pincode;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	public Person() {
		System.out.println("Person Object created");

	}

	public Person(int pid, String name, int age, String address, String city, long pincode) {
		super();
		this.pid = pid;
		this.name = name;
		this.age = age;
		this.address = address;
		this.city = city;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", age=" + age + ", address=" + address + ", city=" + city
				+ ", pincode=" + pincode + "]";
	}

}
