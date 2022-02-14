package com.oms.model;

import java.util.*;

public class OmsItem {
	
	
	
	private String itemname;
	private int itemid;
	private OmsLocation location;
	
	@Override
	public String toString() {
		return "OmsItem [itemname=" + itemname + ", itemid=" + itemid + "]";
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	
	
	

	
	
}
