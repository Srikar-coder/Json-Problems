package jsonproblems.oops.model;

public class stock {
	private String name;
	private int shares;
	private double price;

	public stock(String name, int shares, double price) {
		super();
		this.name = name;
		this.shares = shares;
		this.price = price;
	}

	public stock() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getShares() {
		return shares;
	}

	public Integer setShares(Integer shares) {
		this.shares = shares;
		return shares;

	}

	public double getPrice() {
		return price;
	}

	public double setPrice(double price) {
		this.price = price;
		return price;
	}

}
