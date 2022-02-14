package com.wms.om.OrderManagementServiceImpl;

import java.util.*;
import com.oms.model.*;

import com.wms.om.OrdermanagementServiceInterface.*;
import com.oms.model.*;

public class OmsServiceImplementation implements OmsService {
	
	OmsInventory obj1 = new OmsInventory();
	List<OmsCustomer> list = new ArrayList<OmsCustomer>();
	List<OmsCustomer> list1 = new ArrayList<OmsCustomer>();
	
	@Override
	public List<OmsInventory> createOrder(List<OmsOrderLine> list1, List<OmsInventory> list2) {
		
		 Map<String, Integer> hashMap = new HashMap<>();
		 
		 for(OmsOrderLine orderline : list1){
			 
			 String itemname = orderline.getItem().getItemname().toLowerCase();
			 int itemquantity = orderline.getQuantity();
			if(hashMap.containsKey(itemname)){
				hashMap.put(itemname, hashMap.get(itemname) + itemquantity);
			} else {
				hashMap.put(itemname, itemquantity);
			}
		 }
		 System.out.println(hashMap);
		for(Map.Entry<String, Integer> entry : hashMap.entrySet()){
			String key = entry.getKey();
			Integer value = entry.getValue();
			for(OmsInventory inventory : list2){
				if(inventory.getItem().getItemname().toLowerCase().equals(key.toLowerCase())){
					int onhandquantity = inventory.getOnhandquanttity();
					if(onhandquantity < value){
						System.out.println("Cannot order! Please order between 0 and " + onhandquantity);
					} else{
						onhandquantity = onhandquantity - value;
						inventory.setOnhandquanttity(onhandquantity);
					}
				}
			}
		}
		return list2;
	}


	@Override
	public OmsCustomer addCustomerInfo(OmsCustomer obj) {
		OmsCustomer obj1 = new OmsCustomer();
		
		list1.add(obj);
		//System.out.println(list);
		list.add(obj);
		System.out.println(list);
		
		return null;
	}


	@Override
	public void printInventory(List<OmsInventory> list) {
		
		List<String> inventory1 = new ArrayList<String>();
		List<String> inventory2 = new ArrayList<String>();
		List<String> inventory3 = new ArrayList<String>();
		
		inventory1.add(list.get(0).getItem().getItemname());
		inventory1.add(Integer.toString(list.get(0).getOnhandquanttity()));
		inventory1.add(list.get(0).getLocation().getLocationname());
		
		inventory2.add(list.get(1).getItem().getItemname());
		inventory2.add(Integer.toString(list.get(1).getOnhandquanttity()));
		inventory2.add(list.get(1).getLocation().getLocationname());
		
		inventory3.add(list.get(2).getItem().getItemname());
		inventory3.add(Integer.toString(list.get(2).getOnhandquanttity()));
		inventory3.add(list.get(2).getLocation().getLocationname());
		
		 System.out.println("-----------------------------------------------------------------------------");
	        System.out.printf("%10s %20s %10s", "Item", "On hand Quantity", "Location");
	        System.out.println();
	        System.out.println("-----------------------------------------------------------------------------");
	        System.out.format("%10s %10s %20s ",inventory1.get(0), inventory1.get(1), inventory1.get(2));
	        System.out.println();
	        System.out.format("%10s %10s %20s ",inventory2.get(0), inventory2.get(1), inventory2.get(2));
	        System.out.println();
	        System.out.format("%10s %10s %20s ",inventory3.get(0), inventory3.get(1), inventory3.get(2));
	        System.out.println();
	       
	        System.out.println("-----------------------------------------------------------------------------");
		
		
		
	}

}
