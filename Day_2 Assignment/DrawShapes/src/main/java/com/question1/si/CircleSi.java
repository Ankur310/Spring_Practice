package com.question1.si;

public class CircleSi {
	private String shape;
	
	

	public CircleSi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CircleSi(String shape) {
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
