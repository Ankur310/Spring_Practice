package com.question1.si;

public class CylinderSi {
	private String shape;

	public CylinderSi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CylinderSi(String shape) {
		this.shape = shape;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public void draw() {
		System.out.println("You have drawn " + this.shape);
	}
}
