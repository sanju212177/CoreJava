package com.Shape;

public class Square implements Polygon {
	private float side;
	
	public float getSide() {
		return side;
	}

	public void setSide(float side) {
		this.side = side;
	}

	public Square(float side) {
		super();
		this.side = side;
	}

	@Override
	public void calcArea() {
		// TODO Auto-generated method stub
		float area = side*side;
		System.out.println("Area of square = "+area);
	}

	@Override
	public void calcPeri() {
		// TODO Auto-generated method stub
		float perimeter = side*4;
		System.out.println("Perimeter of square = "+perimeter);
	}

}
