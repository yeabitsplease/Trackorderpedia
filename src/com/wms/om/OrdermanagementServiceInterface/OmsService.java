package com.wms.om.OrdermanagementServiceInterface;

import java.util.List;

import com.oms.model.*;

public interface OmsService {
	
	public List<OmsInventory> createOrder(List<OmsOrderLine> list1, List<OmsInventory> list2);
	public OmsCustomer addCustomerInfo(OmsCustomer obj);
	public void printInventory(List<OmsInventory> list);
}
