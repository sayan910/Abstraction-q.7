package com.app;
import java.util.Scanner;
import com.model.SmartPhone;

public class Appmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Mobile Id:");
		int mobileId=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Brand Name:");
		String brandName=sc.nextLine();
		System.out.println("Enter the Price:");
		float price=sc.nextFloat();
		sc.nextLine();
		System.out.println("Enter the camera details:");
		String cameraDetails=sc.nextLine();
		System.out.println("Enter the Network Supported:");
		String networkSupported=sc.nextLine();
		SmartPhone smartphone=new SmartPhone(mobileId, brandName, price, cameraDetails, networkSupported);
		System.out.println("Mobile Id-"+smartphone.getMobileId());
		System.out.println("Brand Name-"+smartphone.getBrandName());
		System.out.println("Price-"+smartphone.getPrice());
		System.out.println("Camera Details-"+smartphone.getCameraDetails());
		System.out.println("Network Supported-"+smartphone.getNetworkSupport());
		
		System.out.println("Discount amount-"+smartphone.calculateDiscount());
		
		

	}

}
