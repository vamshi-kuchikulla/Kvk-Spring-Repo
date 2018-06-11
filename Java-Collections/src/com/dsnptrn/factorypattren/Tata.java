package com.dsnptrn.factorypattren;

public class Tata extends Vehicle {

	private String type;
	private String brand; 
	private String prize; 
	

	public Tata(String type, String brand, String prize) {
		super();
		this.type = type;
		this.brand = brand;
		this.prize = prize;
	}
	@Override
	public String getType() {
		return this.type;
	}

	@Override
	public String getBrand() {
		return this.brand;
	}

	@Override
	public String getPrize() {
		// TODO Auto-generated method stub
		return this.prize;
	}

	

}
