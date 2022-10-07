package com.fixity.shop;

public class Shop {
	Item ItemList;
	//FoodItem foodItemList;
	Order orderList;
	
	
	
	boolean addItem(Item i) {
		if(ItemList == null) {
			ItemList = i;
		}
		else {
			i.setNextItem(ItemList);
			ItemList = i;
		}
		return true;
	}
	
	Item viewItem(String id) {
		Item temp = ItemList;
		while(temp != null) {
			if(temp.getId().equals(id))
				return temp;
			
			temp = temp.getNextItem();
		}
		return null;
	}
	
	
	int noOfItems() {
		Item temp = ItemList;
		int count = 0;
		while(temp != null) {
			count++;
			temp = temp.getNextItem();
		}
		return count;
	}
	
	Item[] viewItems() {
		Item[] ItemView = new Item[noOfItems()];
		int j=0;
		Item temp = ItemList;
		while(temp != null) {
			ItemView[j++] = temp;
			temp = temp.getNextItem();
		}
		return ItemView;
	}
	
	boolean addOrder(Order i) {
		if(orderList == null) {
			orderList = i;
		}
		else {
			i.setNextOrder(orderList);
			orderList = i;
		}
		return true;
	}
	
	int noOfOrders() {
		Order temp = orderList;
		int count = 0;
		while(temp != null) {
			count++;
			temp = temp.getNextOrder();
		}
		return count;
		
	}
	
	Order[] viewOrders() {
		Order viewOrder[] = new Order[noOfOrders()];
		int j=0;
		Order temp = orderList;
		while(temp != null) {
			viewOrder[j++] = temp;
			temp = temp.getNextOrder();
		}
		return viewOrder;
	}

}
