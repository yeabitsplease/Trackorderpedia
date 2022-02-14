package com.oms.model;

public class OmsCustomer {
	

	
	private String doorNo;
	
	private String street;
	private String city;
	private String state;
	private String country;
	private String zipcode;
	private String name;
	
	@Override
	public String toString() {
		return "OmsCustomer [doorNo=" + doorNo + ", street=" + street + ", city=" + city + ", state=" + state
				+ ", country=" + country + ", zipcode=" + zipcode + ", name=" + name + "]";
	}
	public String getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
