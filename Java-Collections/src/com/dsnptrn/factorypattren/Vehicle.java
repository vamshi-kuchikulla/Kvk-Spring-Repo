package com.dsnptrn.factorypattren;

public abstract class Vehicle {
	
	public abstract String getType();
	public abstract String getBrand();
	public abstract String getPrize();
	
	@Override
	public String toString() {
		return "Vehicle [getType()=" + getType() + ", getBrand()=" + getBrand() + ", getPrize()=" + getPrize() + "]";
	}
}
