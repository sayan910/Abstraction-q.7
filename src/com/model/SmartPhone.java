package com.model;

public class SmartPhone extends Mobile {
	private String cameraDetails;
	private String networkSupport;
	public SmartPhone(int mobileId, String brandName, float price, String cameraDetails, String networkSupport) {
		super(mobileId, brandName, price);
		this.cameraDetails = cameraDetails;
		this.networkSupport = networkSupport;
	}
	public String getCameraDetails() {
		return cameraDetails;
	}
	public void setCameraDetails(String cameraDetails) {
		this.cameraDetails = cameraDetails;
	}
	public String getNetworkSupport() {
		return networkSupport;
	}
	public void setNetworkSupport(String networkSupport) {
		this.networkSupport = networkSupport;
	}
	@Override
	public float calculateDiscount() {
		// TODO Auto-generated method stub
		float discount=(15*super.price)/100;
		return discount;
	}
	
	

}
