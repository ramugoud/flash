package com.fixity.shop;

import java.util.Scanner;


public class ShopUi {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Shop s = new Shop();
		int orderId = 1001;
		
		while(true){
			System.out.println("\n---menu---\n1.Additem\n2.view item\n3.view items\n4.take orders\n5.view orders\n6.exit");
			System.out.println("Enter your choice");
			int ch = sc.nextInt();
			switch(ch) {
			
			case 1:
				System.out.println("1.Empty\n2.FoodItem\n3.ElectricalItems\nChoose correct Options");
				
				
				
				int n = sc.nextInt();
				
				
				
				
				Item it = null;
				
				
				/*if(n==1) {
					System.out.println("Enter id,name,price,");
					String itemId = sc.next();
					String itemName = sc.next();
					double itemPrice = sc.nextDouble();
					
					
					it = new Item();
					it.setId(itemId);
					it.setName(itemName);
					it.setPrice(itemPrice);
					
	
				}*/			
				 if(n==2) {
						
						System.out.println("1.Bevarages\n2.SoftDrinks\n3.Dairy Items\n4.Chocolates");
						int choice = sc.nextInt();
						System.out.println("Enter id,name,price,");
						String itemId = sc.next();
						String itemName = sc.next();
						double itemPrice = sc.nextDouble();
						if(choice == -1) {
							break;
						}
						else {
							if(choice==1) {
								
								
								System.out.println("enter Expiry date");
								String edate = sc.next();
								it = new Beverages();
								
								
								
								
								((Beverages)it).setExpirydate(edate);
								
							}
							else if(choice==2) {
								
								
								System.out.println("Enter Made, Quantity, ExpiryDate");
								String made = sc.next();
								String quan = sc.next();
								String expdate = sc.next();
								
								it = new SoftDrinks();
								
								
								((SoftDrinks)it).setMade(made);
								((SoftDrinks)it).setQuantity(quan);
								((SoftDrinks)it).setExpiryDate(expdate);
							}
							
							else if(choice == 3) {
								
							}
							/*else {
								
								
								System.out.println("enter Expiry date");
								String edate = sc.next();
								it = new FoodItem();
								
								
								((FoodItem)it).setExpiryDate(edate);
							}*/
							
	
							
							
							
						}
						it.setId(itemId);
						it.setName(itemName);
						it.setPrice(itemPrice);
						
					
					
				}
				else if(n==3) {
					System.out.println("Enter id,name,price,");
					String itemId = sc.next();
					String itemName = sc.next();
					double itemPrice = sc.nextDouble();
					
					
					System.out.println("enter Watts , Volts and Warranty");
					String wt = sc.next();
					String vo = sc.next();
					String Wa = sc.next();
					
					it = new ElectricalItem();
					it.setId(itemId);
					it.setName(itemName);
					it.setPrice(itemPrice);
					
					((ElectricalItem)it).setWatts(wt);
					((ElectricalItem)it).setVolts(vo);
					((ElectricalItem)it).setWarranty(Wa);
				}
				
				
				
				
				

		
	      boolean b = s.addItem(it);
				if(b) {
					System.out.println("Success");
				}
				else {
					System.out.println("Failed");
				}
				break;
			case 2:
				System.out.println("Enter item Id");
				String itemId1 = sc.next();
				Item item1 = s.viewItem(itemId1);
				if(item1 != null) {
					System.out.print("\n"+item1.getId()+"  "+item1.getName()+"  "+item1.getPrice()+"  ");
					
					if(item1 instanceof FoodItem) {
					System.out.println(((FoodItem)item1).getExpiryDate());
					}
					if(item1 instanceof ElectricalItem) {
						System.out.println(((ElectricalItem)item1).getWatts()+"  "+((ElectricalItem)item1).getVolts()+" "+((ElectricalItem)item1).getWarranty());
					}
					if(item1 instanceof Beverages) {
						System.out.println(((Beverages)item1).getExpirydate());
					}
					if(item1 instanceof SoftDrinks) {
						System.out.println(((SoftDrinks)item1).getMade()+"  "+((SoftDrinks)item1).getQuantity()+"   "+((SoftDrinks)item1).getExpiryDate());
						
					}
					
				}
				break;
			case 3:
				Item itemlist[] = s.viewItems();
				for(Item item:itemlist) {
					System.out.print("\n"+item.getId()+"  "+item.getName()+"  "+item.getPrice());
					
					if(item instanceof FoodItem) {
						System.out.println(((FoodItem)item).getExpiryDate());
					}
					if(item instanceof ElectricalItem) {
						System.out.println(((ElectricalItem)item).getWatts()+"  "+((ElectricalItem)item).getVolts()+" "+((ElectricalItem)item).getWarranty());
					}
					if(item instanceof Beverages) {
						System.out.println(((Beverages)item).getExpirydate());
					}
					if(item instanceof SoftDrinks) {
						System.out.println(((SoftDrinks)item).getMade()+"  "+((SoftDrinks)item).getQuantity()+"   "+((SoftDrinks)item).getExpiryDate());
						
					}
				}
				break;
				
			case 4:
				while(true) {
					Item itemlist1[] = s.viewItems();
					for(Item item:itemlist1) {
						System.out.print("\n"+item.getId()+"  "+item.getName()+"  "+item.getPrice());
						
						if(item instanceof FoodItem) {
							System.out.println(((FoodItem)item).getExpiryDate());
						}
						if(item instanceof ElectricalItem) {
							System.out.println(((ElectricalItem)item).getWatts()+"  "+((ElectricalItem)item).getVolts()+" "+((ElectricalItem)item).getWarranty());
						}
						if(item instanceof Beverages) {
							System.out.println(((Beverages)item).getExpirydate());
						}
						if(item instanceof SoftDrinks) {
							System.out.println(((SoftDrinks)item).getMade()+"  "+((SoftDrinks)item).getQuantity()+"   "+((SoftDrinks)item).getExpiryDate());
							
						}
					}
						System.out.println("\nEnter itemId");
						String id1 = sc.next();
						if(id1.equals("-1")) {
							break;
						}
						else {
						
						
						Item item2 = s.viewItem(id1);
						if(item2 != null) {
							System.out.println("your selected product is: ");
							System.out.println(item2.getName()+"   "+item2.getPrice());
							System.out.println("Enter howmany products you want");
							int k = sc.nextInt();
							double total1 = item2.getPrice() * k;
							System.out.println("cost of your item: "+total1);
							
							
							
							Order ord = new Order();
							ord.setId(orderId);
							ord.setTotal(total1);
							orderId++;
							boolean orderItem = s.addOrder(ord);
							if(orderItem) {
								System.out.println("Success");
							}
							else {
								System.out.println("Failed");
							}
						}	
					}	
				
				}
				break;
				
			case 5:
				double total = 0;
				Order orderlist[] = s.viewOrders();
				for(Order ord:orderlist) {
					System.out.println(ord.getId()+"   "+ord.getTotal());
					total = total + ord.getTotal();
				}
				System.out.println("================================");
				System.out.println("Total Bill:  "+total);
				System.out.println("================================");
				
				break;
				
			case 6:
				System.out.println("Thank you, Happy Shopping.... Visit Again!!!!!!!!");
				System.exit(0);
				break;
				default:System.out.println("Choose correct options");
				
				
				
				
			}
		}
	}
}