package com.oms.model;

import java.util.*;

public class OmsLocation {
	
	private int locationid;
	private String locationname;
	private String locationtype;
	
	@Override
	public String toString() {
		return "OmsLocation [locationid=" + locationid + ", locationname=" + locationname + ", locationtype="
				+ locationtype + "]";
	}
	public int getLocationid() {
		return locationid;
	}
	public void setLocationid(int locationid) {
		this.locationid = locationid;
	}
	
	
	public String getLocationname() {
		return locationname;
	}
	public void setLocationname(String locationname) {
		this.locationname = locationname;
	}
	public String getLocationtype() {
		return locationtype;
	}
	public void setLocationtype(String locationtype) {
		this.locationtype = locationtype;
	}
	
}
