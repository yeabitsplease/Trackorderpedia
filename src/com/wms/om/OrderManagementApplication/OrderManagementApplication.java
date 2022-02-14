package com.wms.om.OrderManagementApplication;


import  com.oms.model.*;
import com.wms.om.OrderManagementController.*;
import com.wms.om.OrderManagementServiceImpl.OmsServiceImplementation;

import java.util.*;
import java.lang.*;

public class OrderManagementApplication {
	
	private static Scanner sc = new Scanner(System.in);
	static OmsCustomer obj = new OmsCustomer();
	
	public static OmsCustomer getCustInfo(){
		
		//Customer Information input
		sc.nextLine();
				System.out.println("Enter Customer Details below :-");
				System.out.print("Name: ");
				String name = sc.nextLine();
				obj.setName(name);
				
				
				System.out.print("Door Number: ");
				String door_No = sc.nextLine();
				obj.setDoorNo(door_No);
				
				
				System.out.print("Street Name:  ");
				String street = sc.nextLine();
				obj.setStreet(street);
				
				System.out.print("City: ");
				String city = sc.nextLine();
				obj.setCity(city);
				
				System.out.print("State: ");
				String state = sc.nextLine();
				obj.setState(state);
				
				System.out.print("Country: ");
				String country = sc.nextLine();
				obj.setCountry(country);
				
				
				System.out.print("Zipcode: ");
				String zipcode = sc.nextLine();
				obj.setZipcode(zipcode);
				
				//System.out.println(obj.toString());
				
		return obj;
	}
	
	public static List<OmsOrderLine> getOrderLine(int count){
		
		List<OmsOrderLine> list = new ArrayList<OmsOrderLine>();
		List<OmsOrder> list1 = new ArrayList<OmsOrder>();
		Random rand = new Random(); 
	    int upperbound = 10000;
	    int randomint = rand.nextInt(upperbound); 
		
	    for(int i = 1 ; i <= count ; i++){
	    	OmsOrderLine obj1 = new OmsOrderLine();
	    	OmsOrder obj2 = new OmsOrder();
	    	
	    	sc.nextLine();
	    	System.out.print("Enter Item name : ");
	    	String item = sc.nextLine();
	    	OmsItem item1 = new OmsItem();
	    	item1.setItemname(item);
	    	obj1.setItem(item1);
		
	    		System.out.print("Enter Quantity: ");
	    		int quantity = sc.nextInt();
	    		obj1.setQuantity(quantity);
	    		if(i == 1){
	    			obj1.setOrderlineid(randomint);
	    		} else {
	    			obj1.setOrderlineid(list.get(0).getOrderlineid());
	    		}
	    		list.add(obj1);
	    		
	    		//Making object order
	    		obj2.setOrderline(obj1);
	    		int number = obj2.getOrderNumber();
	    		obj2.setOrderNumber(number + 1);
	    		obj2.setOrderid(randomint);
	    		obj2.setCustomer(obj);
	    		
	    		list1.add(obj2);
	    		System.out.println(list1);
	    		
	    }
		
		
		//System.out.println(obj.toString());
		//System.out.println("Order list : " + list);
		return list;
	}
	
	
	public static void main(String[] args) {
		
		char ans = 'y'; 
		int input;
		OmsCustomer obj1 = new OmsCustomer();
		OmsController obj2 = new OmsController();
		OmsOrderLine obj3 = new OmsOrderLine();
		
		
		List<OmsInventory> list = new ArrayList<OmsInventory>();
		List<OmsOrderLine> list1 = new ArrayList<OmsOrderLine>();
		 list = obj2.getList();
		
		int flag = 0;	
		while(ans == 'y' || ans == 'Y'){
			
			System.out.println("Want to Order \nPress y --> Proceed with order \nPress n --> Exit ");
			ans = sc.next().charAt(0);
			if(ans == 'N' || ans == 'n'){
				System.out.println("Thank you for shopping with us!");
				break;
			} else{
				
				if(flag == 0){
				System.out.println("Press 0 --> get Inventory Details \nPress 1 --> Place Order ");
				input = sc.nextInt();
					if(input == 0){
						 list = obj2.getInventoryDetail();
						 obj2.printInventoryList(list);
						 System.out.println("Thank you!");
						 break;
					} else {
						obj2.printInventoryList(list);
						//input customer information and adding it to list
						obj1 = getCustInfo();
						obj2.getCustomerInformation(obj1);
					}
					System.out.println("Customer Information added successfully!");
				}
					System.out.println("Enter number of items to order");
					int count = sc.nextInt();
					
					
					if(flag != 0){
						obj2.printInventoryList(list);
					}
					System.out.println("Enter Order Details: ");
					sc.nextLine();
					list1 = getOrderLine(count);
					System.out.println("The order is as follows: ");
					//System.out.println(list1);
					obj2.createOrderLine(list1, list);
					obj2.printInventoryList(list);
					
					
					
			}
			flag++;
			//System.out.println("Flag :" + flag);
			
		}
	}

}
