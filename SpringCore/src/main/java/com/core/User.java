package com.core;

public class User {
	private int id;
	private String name;
	private double salary;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String name, double salary) {
		super();
		System.out.println("setting values by cons");
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("settting Id");
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("setting name");
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		System.out.println("setting salary");
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
