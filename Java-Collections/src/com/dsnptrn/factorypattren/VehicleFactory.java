package com.dsnptrn.factorypattren;

public class VehicleFactory {

	public static Vehicle getVehicle(String type, String brand, String prize) {

		if ("honda".equalsIgnoreCase(brand)) {
			return new Honda(type, brand, prize);
		} else {
			if ("tata".equalsIgnoreCase(brand)) {
				return new Tata(type, brand, prize);
			}
		}
		return null;
	}
}
