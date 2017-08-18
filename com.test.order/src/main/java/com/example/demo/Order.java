package com.example.demo;

public class Order {

	public String orderName;
	public String orderCompany;

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public String getOrderCompany() {
		return orderCompany;
	}

	public void setOrderCompany(String orderCompany) {
		this.orderCompany = orderCompany;
	}

	public Order(String orderName, String orderCompany) {
		super();
		this.orderName = orderName;
		this.orderCompany = orderCompany;
	}

}
