package com.question1.ci;

public class Traingle {
	
	private String shape;
	
	public Traingle(String shape) {
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

