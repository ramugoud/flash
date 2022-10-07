package com.fixity.shop;

public abstract class FoodItem extends Item {
	public FoodItem() {
		// TODO Auto-generated constructor stub
	}
	
	String expiryDate;

	public String getExpiryDate() {
		return expiryDate;
	}

	public abstract void setExpiryDate(String expiryDate);
	
	

}
