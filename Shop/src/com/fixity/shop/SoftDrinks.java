package com.fixity.shop;

public class SoftDrinks extends FoodItem{
	public SoftDrinks() {
		// TODO Auto-generated constructor stub
	}
	
	String expiryDate,quantity,made;

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getMade() {
		return made;
	}

	public void setMade(String made) {
		this.made = made;
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