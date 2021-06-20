package com.bridgelabz.oops.model;

public class Stock {

	private int id;
	private String name;
	private double weight;
	private double price;

	// declaring constructor
	public Stock(int id, String name, int weight, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.weight = weight;

	}

	public Stock() {
	}

	// getters and setters
	public int getId() {

		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
