package com.model;

public class Mobile {
	protected int mobileId;
	protected String brandName;
	protected float price;
	public Mobile(int mobileId, String brandName, float price) {
		this.mobileId = mobileId;
		this.brandName = brandName;
		this.price = price;
	}
	public int getMobileId() {
		return mobileId;
	}
	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float calculateDiscount() {
		float discount=(price*10)/100;
		return discount;
	}
	
	

}
