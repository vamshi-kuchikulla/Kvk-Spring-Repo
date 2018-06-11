package com.dsnptrn.factorypattren;

public class FactoryTest {
	public static void main(String[] args) {
      Vehicle honda = VehicleFactory.getVehicle("Tow-Wheelar", "honda", "40k");
      Vehicle tata = VehicleFactory.getVehicle("4-wheelar","tata", "300k");
      System.out.println(honda);
      System.out.println(tata);
	}
}
