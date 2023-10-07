package edu.jsp.stream_api.entity;

public class Product {

	private int id;
	private String name;
	private String Address;
	private double cost;

	public Product(int id, String name, String address, double cost) {
		super();
		this.id = id;
		this.name = name;
		Address = address;
		this.cost = cost;
	}

	public Product() {
		super();
	}

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

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", Address=" + Address + ", cost=" + cost + "]\n";
	}

	@Override
	public int hashCode() {
		Double Cost = cost;
		return Cost.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return Double.valueOf(this.cost).hashCode() == ((Product) (obj)).hashCode();
	}

}
