package com.gktechtalks.shallowclonedemo;

public class Address implements Cloneable {
	
	
	private String addressLine;
	private String city;
	private String State;
	private String country;
	
	
	Address(String addressLine,String city,String state,String country){
		
		this.addressLine = addressLine;
		this.city = city;
		this.State = state;
		this.country = country;
	}
	public String getAddressLine() {
		return addressLine;
	}
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	  protected Object clone() throws CloneNotSupportedException {
	        return super.clone();
	    }


}
