package com.test;
import com.Shape.*;

public class TestPolygon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square square = new Square(12);
		square.calcArea();
		square.calcPeri();
		System.out.println("\n------------------------\n");
		Rectangle rect = new Rectangle(15,9);
		rect.calcArea();
		rect.calcPeri();
	}

}
