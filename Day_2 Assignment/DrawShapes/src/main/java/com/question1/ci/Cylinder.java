package com.question1.ci;

public class Cylinder {
	private String shape;
	
	public Cylinder(String shape) {
		this.shape = shape;
	}
	
	public String getShape() {
		return shape;
	}


	public void setShape(String shape) {
		this.shape = shape;
	}


	public  void draw() {
		System.out.println("You have drawn " + this.shape);
	}
}
