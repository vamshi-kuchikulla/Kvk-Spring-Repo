package com.dp.factoryAbstract;

public class TestFactory {
	public static void main(String[] args) {
      Shape s1 = ShapeFactory.getShape("SQUARE");
      s1.draw();
      Shape circle = ShapeFactory.getShape("CIRCLE");
      circle.draw();
	}
}