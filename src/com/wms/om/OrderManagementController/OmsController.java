package com.wms.om.OrderManagementController;

import java.util.*;

import com.oms.model.*;
import com.wms.om.OrderManagementServiceImpl.*;

public class OmsController {
	
	static OmsServiceImplementation obj = new OmsServiceImplementation();
	OmsInventory OIobj = new OmsInventory();
	
	public List<OmsInventory> getInventoryDetail(){
		
		return OIobj.inventoryList();
		
	}
	
	public void getCustomerInformation(OmsCustomer obj1){
		obj.addCustomerInfo(obj1);
	}
	
	public List<OmsInventory> createOrderLine(List<OmsOrderLine> list1, List<OmsInventory> list2){
		List<OmsInventory> list = new ArrayList<OmsInventory>();
		list = obj.createOrder(list1, list2);
		return list;
	}
	
	public List<OmsInventory> getList(){
		return OIobj.inventoryList();
	}
	
	public static void printInventoryList(List<OmsInventory> list){
		obj.printInventory(list);
	}

}
