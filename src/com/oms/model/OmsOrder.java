package com.oms.model;

import com.oms.model.*;

public class OmsOrder {
	
	OmsCustomer customer;
	private int orderid;
	private int orderNumber = 0;
	private OmsOrderLine orderline;
	
	public OmsCustomer getCustomer() {
		return customer;
	}
	public void setCustomer(OmsCustomer customer) {
		this.customer = customer;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public int getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	public OmsOrderLine getOrderline() {
		return orderline;
	}
	public void setOrderline(OmsOrderLine orderline) {
		this.orderline = orderline;
	}
	@Override
	public String toString() {
		return "OmsOrder [customer=" + customer + ", orderid=" + orderid + ", orderNumber=" + orderNumber
				+ ", orderline=" + orderline + "]";
	}
	
	
	
	
	
}
