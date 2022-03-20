package com.Shape;

public class Rectangle implements Polygon {
	private float length;
	private float breadth;
	
	public Rectangle(float length, float breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getBreadth() {
		return breadth;
	}

	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}

	@Override
	public void calcArea() {
		// TODO Auto-generated method stub
		float area = length*breadth;
		System.out.println("Area of Rectangle = "+area);
	}

	@Override
	public void calcPeri() {
		// TODO Auto-generated method stub
		float perimeter = 2*(length+breadth);
		System.out.println("Perimeter of Rectangle = "+perimeter);
	}

}
