package com.dp.factoryAbstract;

public class ShapeFactory {
   public static Shape getShape(String shape) {
	   if(shape == null) {
		   return null;
	   }
	   
	   if(shape.equalsIgnoreCase("SQUARE")){
		   return new Square();
	   }else if(shape.equalsIgnoreCase("CIRCLE")) {
		   return new Circle();
	   }
	return null;
   }
}
