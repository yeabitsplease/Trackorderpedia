package com.oms.model;

import java.util.*;
import com.oms.model.*;

public class OmsInventory {
	
	private int inventoryid = (int)Math.random();
	private int onhandquanttity;
	private OmsLocation location;
	private OmsItem item;
	
	

	@Override
	public String toString() {
		return "OmsInventory [inventoryid=" + inventoryid + ", onhandquanttity=" + onhandquanttity + ", location="
				+ location + ", item=" + item + "]";
	}

	public int getInventoryid() {
		return inventoryid;
	}

	public void setInventoryid(int inventoryid) {
		this.inventoryid = inventoryid;
	}

	public int getOnhandquanttity() {
		return onhandquanttity;
	}

	public void setOnhandquanttity(int onhandquanttity) {
		this.onhandquanttity = onhandquanttity;
	}

	public OmsLocation getLocation() {
		return location;
	}

	public void setLocation(OmsLocation location) {
		this.location = location;
	}

	public OmsItem getItem() {
		return item;
	}

	public void setItem(OmsItem item) {
		this.item = item;
	}

	public List<OmsInventory> inventoryList(){
		OmsItem item1 = new OmsItem();
		item1.setItemid(1);
		item1.setItemname("Shoe");
		
		OmsItem item2 = new OmsItem();
		item2.setItemid(2);
		item2.setItemname("Shirt");
		
		OmsItem item3 = new OmsItem();
		item3.setItemid(3);
		item3.setItemname("Pant");
		
		OmsLocation location1 = new OmsLocation();
		location1.setLocationid(1);
		location1.setLocationname("Bangalore");
		
		OmsLocation location2 = new OmsLocation();
		location2.setLocationid(2);
		location2.setLocationname("Pune");
		
		OmsLocation location3 = new OmsLocation();
		location3.setLocationid(3);
		location3.setLocationname("New Delhi");
		
		
		OmsInventory inventory1= new OmsInventory();
		inventory1.setInventoryid(1);
		inventory1.setItem(item1);
		inventory1.setLocation(location1);
		inventory1.setOnhandquanttity(100);
		

		OmsInventory inventory2= new OmsInventory();
		inventory2.setInventoryid(2);
		inventory2.setItem(item2);
		inventory2.setLocation(location2);
		inventory2.setOnhandquanttity(200);
		
		OmsInventory inventory3= new OmsInventory();
		inventory3.setInventoryid(3);
		inventory3.setItem(item3);
		inventory3.setLocation(location3);
		inventory3.setOnhandquanttity(300);
		
		List<OmsInventory> inventorylist = new ArrayList<OmsInventory>();
		inventorylist.add(inventory1);
		inventorylist.add(inventory2);
		inventorylist.add(inventory3);
		
		return inventorylist;
	}
		
}
	
	
	
