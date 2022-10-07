package com.fixity.shop;

abstract public class Item {
	public String id,name;
	public double price;
	
	Item nextItem;
	
	
	public Item() {
		// TODO Auto-generated constructor stub
	}
	
	public Item(String id,String name,double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public String getId() {
		return id;
	}
	public abstract void setId(String id);
	
	
	public String getName() {
		return name;
	}
	public abstract void setName(String name);
	public double getPrice() {
		return price;
	}
	public abstract void setPrice(double price);

	public Item getNextItem() {
		return nextItem;
	}

	public void setNextItem(Item nextItem) {
		this.nextItem = nextItem;
	}


	
	
	
	
	
	

}
