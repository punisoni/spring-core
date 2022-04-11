package com.construct;

public class Laptop 
{
	private String name;
	private double price;
	private int quantity;
	
	public Laptop(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Laptop [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	public char[] getName() {
		// TODO Auto-generated method stub
		return null;
	}
	public char[] getPrice() {
		// TODO Auto-generated method stub
		return null;
	}
	public char[] getProcessor() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
