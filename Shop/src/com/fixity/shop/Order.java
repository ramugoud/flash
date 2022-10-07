package com.fixity.shop;

public class Order {
	int id;
	double total,totalBill;
	
	
	Order nextOrder;
	
	public Order() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	public Order getNextOrder() {
		return nextOrder;
	}
	public void setNextOrder(Order nextOrder) {
		this.nextOrder = nextOrder;
	}	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public double getTotal() {
		return total;
	}
	
	public void setTotal(double total) {
		this.total = total;
	}
	
	
	public double getTotalBill() {
		return totalBill;
	}


	public void setTotalBill(double totalBill) {
		this.totalBill = totalBill;
	}
	
	

}
