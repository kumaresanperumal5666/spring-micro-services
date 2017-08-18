package com.example.demo;

public class Cart {

	public String cartName;
	public String company;
	

	public Cart(String cartName, String company) {
		super();
		this.cartName = cartName;
		this.company = company;
	}

	public String getCartName() {
		return cartName;
	}

	public void setCartName(String cartName) {
		this.cartName = cartName;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

}
