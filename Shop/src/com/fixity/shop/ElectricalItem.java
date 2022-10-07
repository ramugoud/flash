package com.fixity.shop;

class ElectricalItem extends Item{
	public ElectricalItem() {
		
	}
	
	String warranty;
	String watts;
	String volts;
	public String getWarranty() {
		return warranty;
	}
	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}
	public String getWatts() {
		return watts;
	}
	public void setWatts(String watts) {
		this.watts = watts;
	}
	public String getVolts() {
		return volts;
	}
	public void setVolts(String volts) {
		this.volts = volts;
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
