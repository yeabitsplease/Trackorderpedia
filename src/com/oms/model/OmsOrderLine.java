package com.oms.model;

public class OmsOrderLine {
	
	private int orderlineid;
	private int quantity;
	private OmsItem item;
	
	
	@Override
	public String toString() {
		return "OmsOrderLine [orderlineid=" + orderlineid + ", quantity=" + quantity + ", item=" + item + "]";
	}
	public int getOrderlineid() {
		return orderlineid;
	}
	public void setOrderlineid(int orderlineid) {
		this.orderlineid = orderlineid;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public OmsItem getItem() {
		return item;
	}
	public void setItem(OmsItem item) {
		this.item = item;
	}
	
	
	
	
	
}
