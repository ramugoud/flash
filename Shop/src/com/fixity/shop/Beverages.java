package com.fixity.shop;

public class Beverages extends Item {
	public Beverages() {
		// TODO Auto-generated constructor stub
	}
	
	
	String expirydate;


	public String getExpirydate() {
		return expirydate;
	}


	public void setExpirydate(String expirydate) {
		this.expirydate = expirydate;
	}


	@Override
	public void setId(String id) {
		this.id = id;
		// TODO Auto-generated method stub
		
	}


	@Override
	public void setName(String name) {
		this.name = name;
		
		// TODO Auto-generated method stub
		
	}


	@Override
	public void setPrice(double price) {
		this.price = price;
		// TODO Auto-generated method stub
		
	}
	

}
